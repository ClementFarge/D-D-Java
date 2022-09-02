package Table;

import Characters.Characters;
import Main.Menu;
import Main.PlayerOutOfBoundsException;

import java.util.ArrayList;
import java.util.Collections;

public class Board {
    Menu menu = new Menu();
    private final ArrayList<Case> table = new ArrayList<>();

    public void initBoard() {
        Case bonus = new BonusCase();
        EnemyCase enemy = new EnemyCase();
        Case empty = new EmptyCase();
        for (int i = 0; i < 64; i++) {
            if (i <= 21) {
                this.table.add(empty);
            }
            if (i > 21 && i <= 42) {
                this.table.add(enemy);
            }
            if (i > 42) {
                this.table.add(bonus);
            }
        }
        Collections.shuffle(table);
    }

    public void playTurn(Characters player) throws PlayerOutOfBoundsException {
        menu.beginTurn();
        menu.waitForUser();
        menu.displayDice(player.rollDice());
        menu.displayPosition(player.updatePosition());
        Case currentCase = table.get(player.getPosition() - 1);
        currentCase.interact(player);
    }
}
