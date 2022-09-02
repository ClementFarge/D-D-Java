package Characters;
import Shield.Barrier;
import Weapons.spell.Magic;


public class Wizard extends Characters{

    public Wizard() {
        setLife(6);
        setAttack(15);
        setAttackGears(new Magic());
        setDefensiveGears(new Barrier());
    }

    @Override
    public String toString() {
        return "\n [ Wizard ] " + super.toString();
    }
}
