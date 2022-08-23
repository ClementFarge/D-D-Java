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
        String champion = start.chooseChampion();
        Characters p1 = new Characters(champion);
        System.out.println(p1);
        Menu modify = new Menu();
        modify.modifyName(p1);
        System.out.println(p1);
        playTurn();
    }

    public void playTurn() {
        Scanner press = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Press ! to play a turn");
        while (this.position != 64) {
            if (this.position < 64) {
                if (press.nextLine().equals("!")) {
                    rollDice();
                    this.position = this.position + this.dice;
                    System.out.println("Dice : " + this.dice);
                    if (this.position < 64) {
                        System.out.println("Room : " + this.position + "/64");
                    } else {
                        this.position = 64;
                        System.out.println("Room : " + this.position + "/64");
                        endGame();
                    }
                }
            }
        }
    }


    public void rollDice() {
        this.dice = new Random().nextInt(6) + 1;
//        return this.dice;
    }

    public void endGame() {
        if (this.position == 64) {
//            System.out.println("");
            System.out.println("You win ! Press R to restart or anything else to exit");
            Scanner restart = new Scanner(System.in);
            restart.nextLine();
            if (restart.nextLine().equals("R")){
                this.position = 1;
                startGame();
            } else {
                System.exit(0);
            }
        }
    }

    //Getters / Setters

    public int getPosition() {
        return this.position;
    }

}
