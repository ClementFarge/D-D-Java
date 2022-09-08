package Weapons.hand;

import Weapons.Handed;

public class Sword extends Hand implements Handed {
    public Sword() {
        super( "Sword", 5);
    }

    @Override
    public boolean isHanded() {
        return true;
    }
}
