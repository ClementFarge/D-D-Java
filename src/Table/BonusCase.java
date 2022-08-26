package Table;
import Characters.Characters;
import Consumable.Consumables;
import Consumable.Potion;

public class BonusCase extends Case {

    private Consumables bonus;

    public BonusCase(Consumables bonus) {
        this.bonus = bonus;
    }

    @Override
    public void interact(Characters characters) {
        System.out.println("You find a potion in this room");
        Consumables potion = new Potion();
        System.out.println(potion);
        System.out.println("");
        System.out.println("Press Enter to play a turn");
    }

}

