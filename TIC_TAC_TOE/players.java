package TIC_TAC_TOE;

public class players {

    private String name;

    public piece piece;

    players(String name, piece piece) {
        this.piece = piece;
        this.name = name;
    }

    // setter and getter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public piece getPiece() {
        return this.piece;
    }

    public void setPiece(piece piece) {
        this.piece = piece;
    }

}
