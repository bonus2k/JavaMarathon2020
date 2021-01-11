package day17;

public class ChessBoard {
    private ChessPiece[][] chessPieces;

    public ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPieces = chessPieces;
    }

    public void print(){
        for (ChessPiece chPs[]:chessPieces) {
            for (ChessPiece chP:chPs) {
                System.out.print(chP);
            }
            System.out.println();
        }
    }
}
