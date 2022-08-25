import Characters.Characters;
import Characters.Wizard;
import Characters.Warrior;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    //Methods

    Scanner champ = new Scanner(System.in);

    public String choseChampion() {
        System.out.println("Choose a champion : Warrior or Wizard");
        String champion = champ.nextLine();
        while (!champion.equals("Warrior") && !champion.equals("Wizard")) {
            System.out.println("Choose a champion : Warrior or Wizard");
            try {
                champion = champ.nextLine();
            } catch (InputMismatchException ignored) {
            }
        }
        return champion;
    }

    public Characters choseClass(String champion) {
        Characters character1;
        if (champion.equals("Warrior")) {
            character1 = new Warrior();
        } else {
            character1 = new Wizard();
        }
        return character1;
    }

    Scanner choice = new Scanner(System.in);

    public void modifyName(Characters character1) {
        System.out.println("\nEnter your name");
        String modify = choice.nextLine();
        character1.setName(modify);
    }

    Scanner launch = new Scanner(System.in);

    public void startGame() throws PlayerOutOfBoundsException {
        System.out.println("Ready to play ? Y/N");
        if (launch.nextLine().equals("Y")) {
            Game start = new Game();
            start.startGame();
        } else {
            System.out.println("Abort");
        }
    }
}


