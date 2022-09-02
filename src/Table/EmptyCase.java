package Table;

import Characters.Characters;
import Main.Game;

public class EmptyCase extends Case {

    @Override
    public void interact(Characters characters) {
        System.out.println("An empty room");
    }
}
