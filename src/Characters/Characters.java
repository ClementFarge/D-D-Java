package Characters;

import Shield.DefensiveGears;
import Weapons.OffensiveGears;

public abstract class Characters {

    //Attributes

    private String name;
    private int life;
    private int attack;
    private OffensiveGears attackGears;
    private DefensiveGears defensiveGears;

    //Constructors

    //Methods
    @Override
    public String toString() {
        return
                "\nName : " + this.name
                        + "\nLife : " + this.life
                        + "\nAttack : " + this.attack
                        + "\nWeapon : " + this.attackGears
                        + "\nDefense : " + this.defensiveGears;
    }

    //Getters / Setters

    public void setName(String choice) {
        this.name = choice;
    }
    public void setLife(Integer life) {
            this.life = life;
    }
    public void setAttack(Integer attack) {
            this.attack = attack;

        }
    public void setAttackGears(OffensiveGears attackGears) {
        this.attackGears = attackGears ;
    }
    public void setDefensiveGears(DefensiveGears defensiveGears){
        this.defensiveGears = defensiveGears ;
    }
}

