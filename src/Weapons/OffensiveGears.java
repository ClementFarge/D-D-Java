package Weapons;

import java.util.Objects;

public abstract class OffensiveGears {

    //Attributes
    private String weapon ;

    //Methods

    public String toString(){
        return
                this.weapon ;
    }

    // Getters / Setters

    public void setWeapon(String weapon){
        this.weapon = weapon ;
    }
}
