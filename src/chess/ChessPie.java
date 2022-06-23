package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPie extends Piece{
    private Color color;

    public ChessPie(Board board, Color color) {
        super(board);
        this.color = color;
    }

    /**
     * @return Color return the color
     */
    public Color getColor() {
        return color;
    }

}
