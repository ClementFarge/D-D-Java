package Table;
import Characters.Characters;
import Enemies.Dragon;
import Enemies.Enemy;
import Enemies.Goblin;
import Enemies.Pyromancer;
import java.util.Random;

public class EnemyCase extends Case {

    private Enemy enemy;
    private int dice;

    public EnemyCase(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public void interact(Characters characters) {
        System.out.println("There is an enemy in this room, he's attacking you...");
        this.dice = new Random().nextInt(10);
        if (this.dice <= 6) {
            Enemy goblin = new Goblin();
            System.out.println(goblin);
        }
        if (this.dice > 6 && this.dice < 10) {
            Enemy pyromancer = new Pyromancer();
            System.out.println(pyromancer);
        } if (this.dice == 10){
            Enemy dragon = new Dragon();
            System.out.println(dragon);
        }
    }
}

