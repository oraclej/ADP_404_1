public class Chess {
    ChessPiece[] blackPieces = new ChessPiece[16];
    ChessPiece[] whitePieces = new ChessPiece[16];

    ChessPiece[][] pieces = new ChessPiece[2][16];
    ChessPiece[] pieces1 = new ChessPiece[32];


    public static void main(String[] args) {
        ChessPiece horse = new ChessPiece("Horse1", "White", 1, 0);
        horse.move(2,1);
    }
}
