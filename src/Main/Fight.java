package Main;

import Characters.Characters;
import Enemies.Enemy;

public class Fight {

    Menu menu = new Menu();

    public void fight(Enemy enemy, Characters characters) {
        if (characters.getLife() > 0) {
            if (!menu.displayStartFight()) {
                fleeing(characters);
            } else {
                coreFight(enemy, characters);
            }
        }
    }

    public void coreFight(Enemy enemy, Characters characters) {
        while (characters.getLife() > 0 && enemy.getHealth() > 0) {
            int enemyLife = enemy.getHealth() - characters.getAttack();
            int life = characters.getLife() - enemy.getAttack();
            enemy.setHealth(enemyLife);
            System.out.println("You're attacking (" + characters.getAttack() + ")");
            System.out.println("Enemy HP : " + enemyLife);
            menu.waitForUser();
            if (enemy.getHealth() > 0) {
                characters.setLife(life);
                System.out.println("Enemy is attacking (" + enemy.getAttack() + ")");
                System.out.println("Your HP : " + life + "\n");
                menu.waitForUser();
            }
            if (enemy.getHealth() <= 0) {
                System.out.println("Enemy killed !");
            }
        }
    }

    public void fleeing(Characters player) {
        player.rollDice();
        player.updateNegativePosition();
        menu.displayDice(player.getDice());
        menu.displayPosition(player.getPosition());
    }
}