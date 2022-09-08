package Weapons.hand;

import Weapons.Handed;


public class Stick extends Hand implements Handed {
    public Stick() {
        super("Stick", 0);
    }

    @Override
    public boolean isHanded() {
        return true;
    }
}
