package Characters;
import Weapons.Staff;
import Shield.Barrier;

public class Wizard extends Characters{

    public Wizard() {
        setLife(6);
        setAttack(15);
        setAttackGears(new Staff());
        setDefensiveGears(new Barrier());
    }

    @Override
    public String toString() {
        return " [ Wizard ] " + super.toString();
    }
}
