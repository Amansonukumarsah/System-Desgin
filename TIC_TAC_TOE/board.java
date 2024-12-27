package TIC_TAC_TOE;

import java.util.ArrayList;

public class board {

    public int size;
    public piece[][] board;

    board(int size) {
        this.size = size;
        board = new piece[size][size];
    }

    public boolean addPiece(int row, int col, piece piece) {
        if (board[row][col] != null) {
            return false;
        }
        board[row][col] = piece;
        return true;
    }

    public list<pair<integer, integer>> getFreeCalls() {
        list<pair<integer, integer>> freeSpaces = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            for (int j = 0; j < size(); j++) {
                if (board[i][j] == null) {
                    pair<integer, integer> rowCol = new pair<>(i, j);
                    freeSpaces.add(rowCol);
                }
            }
        }

        return freeSpaces;
    }

    public void printBoard() {

    }

}
