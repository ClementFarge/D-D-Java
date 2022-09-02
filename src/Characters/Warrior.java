package Characters;
import Shield.Shield;
import Weapons.hand.Stick;

public class Warrior extends Characters {

    public Warrior() {
            setLife(10);
            setAttack(10);
            setAttackGears(new Stick());
            setDefensiveGears(new Shield());
    }

    @Override
    public String toString() {
        return "\n [ Warrior ] " + super.toString();
    }
}
