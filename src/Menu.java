import Characters.Characters;
import Characters.Wizard;
import Characters.Warrior;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void displayGameInfo() {
        System.out.println("You are entering into the Darkest Dungeon, you will die, but when ?");
    }

    public void beginTurn(){
        System.out.println("Press (Enter) to play a turn");
    }

    public void waitForUser(){
        Scanner press = new Scanner(System.in);
        while (!press.nextLine().equals(""));
    }

    public void displayDice(int result){
        System.out.println("Dice : " + result);
    }

    public void displayPosition(int position ){
        System.out.println("Room : " + position + "/64");

    }

    public Characters choseClass() {
        Scanner champ = new Scanner(System.in);
        System.out.println("Choose a champion : Warrior (1) or Wizard (2)");
        String champion = champ.nextLine();
        while (!champion.equals("1") && !champion.equals("2")) {
            System.out.println("Choose a champion : Warrior (1) or Wizard (2)");
            try {
                champion = champ.nextLine();
            } catch (InputMismatchException ignored) {

            }
        }
        if (champion.equals("1")) {
            Characters character1;
            character1 = new Warrior();
            return character1;
        } else {
            Characters character1;
            character1 = new Wizard();
            return character1;
        }
    }

    public void modifyName(Characters character1) {
        Scanner choice = new Scanner(System.in);
        System.out.println("\nEnter your name");
        String modify = choice.nextLine();
        character1.setName(modify);
    }

    public void displayCharacter(Characters characters) {
        System.out.println(characters);
    }
}


