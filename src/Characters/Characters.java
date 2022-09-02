package Characters;

import Shield.DefensiveGears;
import Weapons.OffensiveGears;

import java.util.Random;


public abstract class Characters {

    //Attributes

    private int dice ;
    private int position;
    private String name;
    private int life;
    private int attack;
    private OffensiveGears attackGears;
    private DefensiveGears defensiveGears;

    //Constructors
    public Characters(){
        this.dice = 0;
        this.position = 1 ;
    }

    //Methods
    @Override
    public String toString() {
        return
                "\nName : " + this.name
                        + "\nLife : " + this.life
                        + "\nAttack : " + attack
                        + "\nWeapon : " + attackGears
                        + "\nDefense : " + this.defensiveGears;
    }

    //Getters / Setters

    public void setName(String choice) {
        this.name = choice;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setAttackGears(OffensiveGears attackGears) {
        this.attackGears = attackGears;
    }

    public void setDefensiveGears(DefensiveGears defensiveGears) {
        this.defensiveGears = defensiveGears;
    }

    public int updatePosition() {
       return this.position = this.position + this.dice;
    }

    public void updateNegativePosition() {
        this.position = this.position - this.dice;
    }

    public int rollDice() {
        return this.dice = new Random().nextInt(6) + 1;
    }
    public int getLife() {
        return this.life;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getDice(){
        return this.dice;
    }
    public int getPosition(){
        return this.position;
    }

}

