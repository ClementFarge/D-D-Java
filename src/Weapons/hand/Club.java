package Weapons.hand;

import Weapons.Handed;


public class Club extends Hand implements Handed {
    public Club() {
        super( "Club", 3);
    }

    @Override
    public boolean isHanded() {
        return true;
    }
}
