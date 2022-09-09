package Board;

import Characters.Characters;

public interface Case {

    String ANSI_RED = "\u001B[31m";
    String ANSI_RESET = "\u001B[0m";
    String ANSI_YELLOW = "\u001B[35m" ;
    String fire = "\uD83D\uDD25" ;
    String drake = "\uD83D\uDC09";
    String wizard = "\uD83E\uDDD9\u200D♂️";
    String gob = "\uD83D\uDC79";


    public void interact(Characters characters);
}
