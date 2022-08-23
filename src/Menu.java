import java.util.Scanner;

public class Menu {

    //Methods

    Scanner champ = new Scanner(System.in);

    public String chooseChampion() {
        System.out.println("Choose a champion : Warrior or Wizard");
        String champion = champ.nextLine();
        System.out.println("You chose : " + champion);
        return champion;
    }

    Scanner choice = new Scanner(System.in);

    public void modifyName(Characters character1) {
        System.out.println("Enter your name");
        String modify = choice.nextLine();
        character1.setName(modify);
    }

    Scanner lunch = new Scanner(System.in);
    public void startGame(){
        System.out.println("Ready to play ? Y/N");
        if(lunch.nextLine().equals("Y")){
            Game start = new Game();
            start.startGame();
            System.out.println("Room : " + start.getPosition());
        }else {
            System.out.println("Abort");
        }
    }
}


