import Characters.Characters;
import Characters.Wizard;
import Characters.Warrior;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    //Methods

    public String choseChampion() {
        Scanner champ = new Scanner(System.in);
        System.out.println("Choose a champion : Warrior (1) or Wizard (2)");
        String champion = champ.nextLine();
        while (!champion.equals("1") && !champion.equals("2")) {
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
        if (champion.equals("1")) {
            character1 = new Warrior();
        } else {
            character1 = new Wizard();
        }
        return character1;
    }

    public void modifyName(Characters character1) {
        Scanner choice = new Scanner(System.in);
        System.out.println("\nEnter your name");
        String modify = choice.nextLine();
        character1.setName(modify);
    }

}


