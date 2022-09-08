package Weapons.spell;

import Weapons.Handed;

public class Magic extends Spell implements Handed {
    public Magic() {
        super("Magic", 0);
    }

    @Override
    public boolean isHanded() {
        return false;
    }
}
