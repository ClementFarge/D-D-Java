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
    private ArrayList<Case> table = new ArrayList<>();
    private Characters player;

    //Constructors

    public Game() {
        this.position = 0;
        Case bonus = new BonusCase(new Potion());
        EnemyCase enemy = new EnemyCase(new Goblin());
        Case empty = new EmptyCase();
        table.add(empty);
        table.add(bonus);
        table.add(enemy);

    }

    //Methods

    public void startGame() {
        System.out.println("You are entering into the Darkest Dungeon, you will die, but when ?");
        Menu start = new Menu();
        Menu modify = new Menu();
        String champion = start.choseChampion();
        this.player = start.choseClass(champion);
        modify.modifyName(this.player);
        System.out.println(this.player);
        try {
            playTurn();
        } catch (PlayerOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
    public void playTurn() throws PlayerOutOfBoundsException {
        Scanner press = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Press Enter to play a turn");
        while (this.position != table.toArray().length) {
            rollDice();
            if (press.nextLine().equals("")) {
                this.position = this.position + this.dice;
                System.out.println("Dice : " + this.dice);
                System.out.println("Room : " + this.position + "/64");
                table.get(this.position -1).interact(this.player);
            }
            if (this.position > table.toArray().length) {
                throw new PlayerOutOfBoundsException();
            }
        }
        endGame();
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

    //Getters / Setters

}
