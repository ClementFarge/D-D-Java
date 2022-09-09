package Board;

import Characters.Characters;
import Consumable.Consumables;
import Consumable.GreatPotion;
import Consumable.Potion;

import Weapons.*;
import Weapons.hand.Club;
import Weapons.hand.Sword;
import Weapons.spell.Fire;
import Weapons.spell.Lightning;
import Characters.*;

import java.util.Random;

public class BonusCase implements Case {

    public BonusCase() {
    }

    @Override
    public void interact(Characters characters) {
        int dice = new Random().nextInt(4);
        if (characters instanceof Warrior) {
            if (dice == 0) {
                OffensiveGears sword = new Sword();
                System.out.println(ANSI_YELLOW + "You find a " + sword + ANSI_RESET);
                if (characters.getAttack() < 15) {
                    characters.setAttack(characters.getAttack() + 5);
                    characters.setAttackGears(sword);
                }
            }
            if (dice == 1) {
                OffensiveGears club = new Club();
                System.out.println(ANSI_YELLOW + "You find a " + club + ANSI_RESET);
                if (characters.getAttack() < 12) {
                    characters.setAttack(characters.getAttack() + 3);
                    characters.setAttackGears(club);
                }
            }
        }
        if (characters instanceof Wizard) {
            if (dice == 0) {
                OffensiveGears fire = new Fire();
                System.out.println(ANSI_YELLOW + "You find a " + fire + ANSI_RESET);
                if (characters.getAttack() < 22) {
                    characters.setAttack(characters.getAttack() + 7);
                    characters.setAttackGears(fire);
                }
            }
            if (dice == 1) {
                OffensiveGears lightning = new Lightning();
                System.out.println(ANSI_YELLOW + "You find a " + lightning + ANSI_RESET);
                if (characters.getAttack() < 17) {
                    characters.setAttack(characters.getAttack() + 2);
                    characters.setAttackGears(lightning);
                }
            }
            if (dice == 2) {
                Consumables potion = new Potion();
                characters.setLife(characters.getLife() + 2);
                System.out.println(ANSI_YELLOW + "You find a " + potion + ANSI_RESET);
            }
            if (dice == 3) {
                Consumables greatPotion = new GreatPotion();
                characters.setLife(characters.getLife() + 5);
                System.out.println(ANSI_YELLOW + "You find a " + greatPotion + ANSI_RESET);
            }
        }
    }
}

