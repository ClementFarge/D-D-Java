package Table;

import Characters.Characters;
import Consumable.Consumables;
import Consumable.GreatPotion;
import Consumable.Potion;
import Weapons.*;
import Weapons.hand.Club;
import Weapons.hand.Sword;
import Weapons.spell.Fire;
import Weapons.spell.Lightning;

import java.util.Random;

public class BonusCase extends Case {

    private Consumables potion;
    private OffensiveGears weapon;

    private int dice;

    public BonusCase(Consumables potion) {
        this.potion = potion;
    }

    @Override
    public void interact(Characters characters) {
        System.out.println("You find a treasure chest in this room");
        this.dice = new Random().nextInt(6);
        if (this.dice == 0) {
            Consumables potion = new Potion();
            System.out.println(potion);
            System.out.println("");
        }if (this.dice == 1){
            OffensiveGears sword = new Sword();
            System.out.println(sword);
            System.out.println("");
        }if (this.dice == 2){
            OffensiveGears club = new Club();
            System.out.println(club);
            System.out.println("");
        }if (this.dice == 3){
            Consumables greatPotion = new GreatPotion();
            System.out.println(greatPotion);
            System.out.println("");
        }if (this.dice == 4){
            OffensiveGears fire = new Fire();
            System.out.println(fire);
            System.out.println("");
        }if (this.dice == 5) {
            OffensiveGears lightning = new Lightning();
            System.out.println(lightning);
            System.out.println("");
        }
    }

}

