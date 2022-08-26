package Table;

import Characters.Characters;

public class EmptyCase extends Case {

    @Override
    public void interact(Characters characters) {
        System.out.println("An empty room");
        System.out.println("");
        System.out.println("Press Enter to play a turn");
    }
}
