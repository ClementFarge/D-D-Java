package Weapons;

public abstract class OffensiveGears {
    //Attributes
    private String name;
    private int attack;
    private String type ;

    protected OffensiveGears(String type , String name , int attack){
        this.name = name ;
        this.type = type ;
        this.attack = attack;
    }

    //Methods
@Override
    public String toString() {
        return
                this.name ;
//                        + "\nWeapon attack bonus : " + this.attack;
    }
}
