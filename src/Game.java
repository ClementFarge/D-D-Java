import Characters.Characters;
import Consumable.Potion;
import Enemies.Goblin;
import Table.Case;
import Table.EmptyCase;
import Table.EnemyCase;
import Table.BonusCase;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

    //Attributes

    private int position;
    private int dice;
    private final ArrayList<Case> table = new ArrayList<>();
    private Characters player;
    private final Menu menu = new Menu();

    //Constructors

    public Game() {
        this.position = 0;
        Case bonus = new BonusCase(new Potion());
        EnemyCase enemy = new EnemyCase(new Goblin());
        Case empty = new EmptyCase();
        table.add(empty);
        table.add(bonus);
        table.add(enemy);
        table.add(enemy);
        table.add(enemy);
    }

    //Methods

    public void startGame() {
        menu.displayGameInfo();
        this.player = menu.choseClass();
        menu.modifyName(this.player);
        menu.displayCharacter(this.player);
        try {
            while (!isEnded()) {
                playTurn();
            }
            endGame();
        } catch (PlayerOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void playTurn() throws PlayerOutOfBoundsException {
        menu.beginTurn();
        menu.waitForUser();
        rollDice();
        menu.displayDice(this.dice);
        updatePosition();
        menu.displayPosition(this.position);
        Case currentCase = table.get(this.position - 1);
        currentCase.interact(this.player);
        checkPosition();
    }

    public void checkPosition() throws PlayerOutOfBoundsException {
        if (this.position > table.toArray().length) {
            throw new PlayerOutOfBoundsException();
        }
    }

    public void updatePosition() {
        this.position = this.position + this.dice;
    }

    public void rollDice() {
        this.dice = new Random().nextInt(1) + 1;
    }

    public void endGame() {
        if (this.position == table.toArray().length) {
            System.out.println("\nYou died and nobody cares ! Press Enter to restart or anything else to exit");
            Scanner restart = new Scanner(System.in);
            restart.nextLine();
            if (restart.nextLine().equals("")) {
                startGame();
            } else {
                System.exit(0);
            }
        }
    }

    public boolean isEnded() {
        return this.position >= this.table.toArray().length;
    }

}
