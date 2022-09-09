package Main;

import Characters.Characters;
import Board.*;

import java.sql.SQLException;

/**
 * Game class manages the main proceedings of the game, it calls all methods required to
 * instantiate Characters, Board, Case and Gears
 */
public class Game {

    //Attributes
    private GameState state;
    private Characters player;
    private final Menu menu = new Menu();
    private final Board board = new Board();
    private final DatabaseManagement manage = new DatabaseManagement();

    /**
     * Game constructor defines the GameState to initiate the game
     */
    public Game() {
        this.state = GameState.INIT;
    }

    /**
     * Launch methods defines the GameState (Enum) steps which define more precisely the proceedings
     *
     * @throws PlayerOutOfBoundsException Sends an exception if the character overtake the table boarder
     */
    public void launch() throws PlayerOutOfBoundsException, SQLException {
        while (isOver()) {
            switch (this.state) {
                case INIT -> this.init();
                case PLAYING -> this.play();
                case VICTORY -> this.victory();
                case DEFEAT -> this.defeat();
            }
        }
    }

    /**
     * Init methods calls methods which instantiate and define the character with it gears and attributes.
     * Allow to save and load characters
     *
     * @throws SQLException
     */
    public void init() throws SQLException {
        menu.displayGameInfo();
        if (menu.load()) {
            this.player = manage.loadCharacter(8);
            menu.displayCharacter(this.player);
        } else {
            this.player = menu.choseClass();
            menu.modifyName(this.player);
            manage.save(this.player, String.valueOf(this.player.getClass()));
            menu.displayCharacter(this.player);
        }
        board.initBoard();
        this.state = GameState.PLAYING;
    }

    /**
     *
     * @param player
     */
    public void playTurn(Characters player) {
        menu.beginTurn();
        menu.waitForUser();
        menu.displayDice(player.rollDice());
        menu.displayPosition(player.updatePosition());
        Case currentCase = board.getTable().get(player.getPosition() - 1);
        currentCase.interact(player);
    }

    /**
     * Play method manages the turns during the game, it changes the GameState to Victory or Defeat according to position and health of the player
     *
     * @throws PlayerOutOfBoundsException Sends an exception if the character overtake the table boarder
     */
    public void play() throws PlayerOutOfBoundsException {
        playTurn(this.player);
        if (player.getPosition() == 64) {
            this.state = GameState.VICTORY;
        }
        if (player.getLife() <= 0) {
            this.state = GameState.DEFEAT;
        }
    }

    /**
     * Call isOver method and changes the GameState to Victory
     */
    public void victory() {
        isOver();
        System.out.println("You ");
    }

    /**
     * Call isOver method and changes the GameState to Defeat
     */
    public void defeat() {
        isOver();
    }

    /**
     * Send a boolean who determine if the game id End or not
     */

    public boolean isOver() {
        return true;
    }
}
