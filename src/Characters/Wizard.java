package Characters;
import Shield.Barrier;
import Shield.DefensiveGears;
import Weapons.OffensiveGears;
import Weapons.spell.Magic;


public class Wizard extends Characters{

    public Wizard() {
        setLife(6);
        setAttack(15);
        setAttackGears(new Magic());
        setDefensiveGears(new Barrier());
    }

    public Wizard(String name, int life, int strength, OffensiveGears weapon, DefensiveGears shield) {
       setName(name);
        setLife(life);
        setAttack(strength);
        setAttackGears(weapon);
        setDefensiveGears(shield);
    }

    @Override
    public String toString() {
        return "\n [ Wizard ] " + super.toString();
    }
}
