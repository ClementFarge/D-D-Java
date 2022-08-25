import Characters.Characters;

import java.util.Random;
import java.util.Scanner;

public class Game {

    //Attributes

    private int position;
    private int dice;

    //Constructors

    public Game() {
        this.position = 1;
    }

    //Methods

    public void startGame() {
        Menu start = new Menu();
        Menu modify = new Menu();
        String champion = start.choseChampion();
        Characters p1 = start.choseClass(champion);
        modify.modifyName(p1);
        System.out.println(p1);
        try {
            playTurn();
        } catch (PlayerOutOfBoundsException e) {
            e.printStackTrace();
            this.position = 64 ;
        }
    }

    public void playTurn() throws PlayerOutOfBoundsException {
        Scanner press = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Press Enter to play a turn");
        while (this.position != 64) {
            if (this.position < 64) {
                if (press.nextLine().equals("")) {
                    rollDice();
                    this.position = this.position + this.dice;
                    System.out.println("Dice : " + this.dice);
                    System.out.println("Room : " + this.position + "/64");
                }
            }
            if (this.position > 64) {
                throw new PlayerOutOfBoundsException();
            }
        }
        endGame();
    }

    public void rollDice() {
        this.dice = new Random().nextInt(6) + 1;
    }

    public void endGame() {
        if (this.position == 64) {
            System.out.println("\nYou win ! Press Enter to restart or anything else to exit");
            Scanner restart = new Scanner(System.in);
            restart.nextLine();
            if (restart.nextLine().equals("")) {
                this.position = 1;
                startGame();
            } else {
                System.exit(0);
            }
        }
    }

    //Getters / Setters

}
