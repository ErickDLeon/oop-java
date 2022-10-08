package game;

import game.pieces.Piece;

public class Game {
    Piece[][] board;

    // Constructor creates an empty board
    Game() {
        board = new Piece[8][8];
    }
}
