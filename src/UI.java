import chess.ChessPie;

public class UI {
    public static void printBoard(ChessPie[][] pies) {
        for (int i=0; i<pies.length; i++){
            System.out.print((8-i)+ " ");
            for (int j=0; j<pies.length; j++){
                printPie(pies[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }
    private static void printPie(ChessPie pie){
        if (pie == null){
            System.out.print("-");
        }else{
            System.out.print(pie);
        }
        System.out.print(" ");
    }
}
