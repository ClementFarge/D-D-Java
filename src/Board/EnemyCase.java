package Board;

import Characters.Characters;
import Enemies.Dragon;
import Enemies.Goblin;
import Enemies.Pyromancer;
import Main.Fight;


import java.util.Random;


public class EnemyCase implements Case {

    Dragon dragon;
    Goblin goblin;
    Pyromancer pyromancer;
    Fight fight = new Fight();




    public EnemyCase() {

    }

    //    @Override
    public void interact(Characters characters) {
        System.out.println(ANSI_RED + "There is an enemy in this room, he's attacking you..." + ANSI_RESET);
        int dice = new Random().nextInt(10);
        if (dice <= 6) {
            goblin = new Goblin();
            System.out.println(goblin + gob);
            fight.fight(goblin, characters);
        }
        if (dice > 6 && dice < 9) {
            pyromancer = new Pyromancer();
            System.out.println(pyromancer + wizard);
            fight.fight(pyromancer, characters);
        }
        if (dice == 9) {
            dragon = new Dragon();
            System.out.println(dragon + drake);
            fight.fight(dragon, characters);
        }
    }
}




