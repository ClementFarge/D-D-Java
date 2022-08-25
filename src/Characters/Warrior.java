package Characters;
import Shield.Shield;
import Weapons.Weapon;

public class Warrior extends Characters {

    public Warrior() {
            setLife(10);
            setAttack(10);
            setAttackGears(new Weapon());
            setDefensiveGears(new Shield());
    }

    @Override
    public String toString() {
        return " [ Warrior ] " + super.toString();
    }
}
