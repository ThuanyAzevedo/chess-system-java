package boardgame;

public class Board {
    private int rows;
    private int column;
    private Piece [][] pieces;

    public Board(int rows, int column) {
        this.rows = rows;
        this.column = column;
        pieces = new Piece[rows][column];
    }


    /**
     * @return int return the rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * @param rows the rows to set
     */
    public void setRows(int rows) {
        this.rows = rows;
    }

    /**
     * @return int return the column
     */
    public int getColumn() {
        return column;
    }

    /**
     * @param column the column to set
     */
    public void setColumn(int column) {
        this.column = column;
    }

}
