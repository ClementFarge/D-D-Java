package Table;
import Characters.Characters;
import Enemies.Enemy;
import Enemies.Goblin;

public class EnemyCase extends Case {

    private Enemy enemy ;

    public EnemyCase(Enemy enemy){
        this.enemy = enemy ;
    }
    @Override
    public void interact(Characters characters) {
        System.out.println("There is an enemy in this room, he's attacking you...");
        Enemy goblin = new Goblin();
        System.out.println(goblin);
    }
}
