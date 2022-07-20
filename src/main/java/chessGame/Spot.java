package chessGame;

public class Spot {
    private Piece piece;
    private int x;
    private int y;

    public Spot(Piece piece, int x, int y) {
        this.piece = piece;
        this.x = x;
        this.y = y;
    }
}
