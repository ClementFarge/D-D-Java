package Main;

import Characters.Characters;
import Table.*;


public class Game {

    //Attributes
    private GameState state;

    private Characters player;
    private final Menu menu = new Menu();
    private final Board board = new Board();

    public Game() {
        this.state = GameState.INIT ;
    }

    public void launch() throws PlayerOutOfBoundsException {
        while (isOver()) {
            switch (this.state) {
                case INIT -> {
                    this.init();
                }
                case PLAYING -> {
                    this.play();
                }
                case VICTORY -> {
                    this.victory();
                }
                case DEFEAT -> {
                    this.defeat();
                }
            }
        }
    }

    public void init() {
        menu.displayGameInfo();
        this.player = menu.choseClass();
        board.initBoard();
        menu.modifyName(this.player);
        menu.displayCharacter(this.player);
        this.state = GameState.PLAYING ;
    }

    public void play() throws PlayerOutOfBoundsException {
        board.playTurn(this.player);
        if (player.getPosition() == 64) {
            this.state = GameState.VICTORY;
        }
        if (player.getLife() <= 0) {
            this.state = GameState.DEFEAT;
        }
    }

    public void victory() {
        isOver();
    }

    public void defeat() {
        isOver();
    }

    public boolean isOver() {
        return true;
    }
}
