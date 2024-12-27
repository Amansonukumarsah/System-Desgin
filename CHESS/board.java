package CHESS;

public class board {

    public cell[][] board;
    players player;
    pieces pieces;
    cell cell;

    board(board board) {
        this.board = new cell[8][8];
    }

    public void initializeBoard(String name, String color, int i) {
        if (i == 0) {
            i = 1; // if player 1
        } else {
            i = 7; // if player 2
        }
        for (int j = 0; j < 8; j++) {
            board[i][j] = new cell(new players(name, color), new pieces(pieceType.Pawn), i, j);
        }

        board[i][0] = new cell(new players(name, color), new pieces(pieceType.Knight), i, 0);
        board[i][1] = new cell(new players(name, color), new pieces(pieceType.Bishop), i, 1);
        board[i][2] = new cell(new players(name, color), new pieces(pieceType.Rook), i, 2);
        board[i][3] = new cell(new players(name, color), new pieces(pieceType.King), i, 3);
        board[i][4] = new cell(new players(name, color), new pieces(pieceType.Queen), i, 4);
        board[i][5] = new cell(new players(name, color), new pieces(pieceType.Rook), i, 5);
        board[i][6] = new cell(new players(name, color), new pieces(pieceType.Bishop), i, 6);
        board[i][7] = new cell(new players(name, color), new pieces(pieceType.Knight), i, 7);

    }

}
