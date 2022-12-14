package Enemies;


public abstract class Enemy {

    private String name;
    private int health;
    private int attack;

    @Override
    public String toString() {
        return
                "\nEnemy : " + this.name
                        + "\nHealth : " + this.health
                        + "\nAttack : " + this.attack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }
}
