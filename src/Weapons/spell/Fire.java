package Weapons.spell;

import Weapons.Handed;

public class Fire extends Spell implements Handed {
    public Fire() {
        super("Fireball", 7);
    }

    @Override
    public boolean isHanded() {
        return false;
    }
}
