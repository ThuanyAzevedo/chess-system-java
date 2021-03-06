package chess;

import boardgame.Board;

public class ChessMatch {
    private Board board; 

    public ChessMatch(){
        board = new Board(8, 8);
    }
    public ChessPie[][] getPies(){
        ChessPie[][] mat = new ChessPie[board.getRows()][board.getColumn()];
        for (int i=0; i<board.getRows(); i++){
            for (int j=0; j<board.getColumn(); j++){
                mat[i][j] = (ChessPie) board.piece(i,j);
            }
        }
        return mat;
    }
}
