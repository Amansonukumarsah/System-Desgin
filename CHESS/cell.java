package CHESS;

public class cell {

    private int x;
    private int y;

    private pieces pieces;

    public players players;

    cell(players players, pieces pieces, int x, int y) {
        this.pieces = new pieces(null);
        this.players = new players(null, null);
        this.x = x;
        this.y = y;

    }

    public pieces getPieces() {
        return this.pieces;
    }

    public players getPlayers() {
        return this.players;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    // moves();
}
