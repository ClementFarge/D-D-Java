package Board;

import Characters.Characters;


public class EmptyCase implements Case {

    @Override
    public void interact(Characters characters) {
        System.out.println("An empty room");
    }
}
