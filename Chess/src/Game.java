public class Game {
    Piece [][] board;
    // Constructor creates an empty board
    Game(){
        board = new Piece[8][8];
    }
    Position currentPosition = new Position(1,1);
}
