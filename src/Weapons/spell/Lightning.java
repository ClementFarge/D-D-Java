package Weapons.spell;

import Weapons.Handed;

public class Lightning extends Spell implements Handed {
    public Lightning() {
        super("Lightning flow", 2);
    }

    @Override
    public boolean isHanded() {
        return false;
    }
}
