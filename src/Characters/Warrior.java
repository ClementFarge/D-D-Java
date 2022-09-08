package Characters;

import Shield.Shield;
import Weapons.OffensiveGears;
import Shield.DefensiveGears;

import Weapons.hand.Stick;

public class Warrior extends Characters {

    public Warrior() {
        setLife(10);
        setAttack(10);
        setAttackGears(new Stick());
        setDefensiveGears(new Shield());
    }

    public Warrior(String name, int life, int strength, OffensiveGears weapon, DefensiveGears shield) {
        setName(name);
        setLife(life);
        setAttack(strength);
        setAttackGears(weapon);
        setDefensiveGears(shield);
    }

    @Override
    public String toString() {
        return "\n [ Warrior ] " + super.toString();
    }
}
