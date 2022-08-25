package Shield;

import java.util.Objects;

public abstract class DefensiveGears {

    //Attributes
    private String shield;

    //Methods

//    public Shield.DefensiveGears(String champion) {
//        if (Objects.equals(champion, "Characters.Warrior")) {
//            this.shield = "Shield.Shield";
//        } else {
//            this.shield = "Shield.Shield.Barrier";
//        }
//    }

    public String toString() {
        return
                this.shield;
    }

    // Getters / Setters

    public void setShield(String shield){
        this.shield = shield;
    }

}


