import java.util.Objects;

public class Characters {

    //Attributes

    private String name;
    private Integer life;
    private Integer attack;
    private String attackGears;
    private String defensiveGears;

    //Constructors

    public Characters(String champion) {
        if (Objects.equals(champion, "Warrior")) {
            this.life = 10;
            this.attack = 10;
            this.attackGears = new OffensiveGears("Warrior").toString();
            this.defensiveGears = new DefensiveGears("Warrior").toString();
        } if (Objects.equals(champion, "Wizard")) {
            this.life = 6;
            this.attack = 15;
            this.attackGears = new OffensiveGears("Wizard").toString();
            this.defensiveGears = new DefensiveGears("Wizard").toString();
        }
    }

    //Methods

    public String toString() {
        return
                "Name : " + this.name
                        + "\nlife : " + this.life
                        + "\nattack : " + this.attack
                        + "\nWeapon : " + this.attackGears
                        + "\nDefense : " + this.defensiveGears;
    }

    //Getters / Setters

    public void setName(String choice){
        this.name = choice ;
    }
}
