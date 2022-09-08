package Table;

import Characters.Characters;
import Main.Menu;

import java.util.ArrayList;
import java.util.Collections;

public class Board {
    Menu menu = new Menu();
    private final ArrayList<Case> table = new ArrayList<>();

    public void initBoard() {
        for (int i = 0; i < 64; i++) {
            if (i <= 21) {
                this.table.add(new EmptyCase());
            }
            if (i > 21 && i <= 42) {
                this.table.add(new EnemyCase());
            }
            if (i > 42) {
                this.table.add(new BonusCase());
            }
        }
        Collections.shuffle(table);
    }

    public void playTurn(Characters player) {
        menu.beginTurn();
        menu.waitForUser();
        menu.displayDice(player.rollDice());
        menu.displayPosition(player.updatePosition());
        Case currentCase = table.get(player.getPosition() - 1);
        currentCase.interact(player);
    }
}
