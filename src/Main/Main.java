package Main;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws PlayerOutOfBoundsException, SQLException {
        Game launch = new Game();
        launch.launch();
    }
}
