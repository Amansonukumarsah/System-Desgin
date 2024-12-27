package CHESS;

import java.util.Arrays;
import java.util.List;

public class moves {

    private board board;
    private cell cell;

    // moves()

    public boolean isValid(int x, int y) {
        if (x < 0 || y < 0 || x > 8 || y > 8) {
            return false;
        }
        return true;
    }

    public boolean isValidPath(int x, int y) {
        List<int[]> dir = Arrays.asList(
                new int[] { 0, 1 },
                new int[] { 1, 0 },
                new int[] { -1, 0 },
                new int[] { 0, -1 });
        for (int[] val : dir) {
            if (!isValid(x + val[0], y + val[1])) {
                return false;
            }
        }
        return true;

    }

    public boolean King(int x, int y) {
        int prevX = cell.getX();
        int prevY = cell.getY();
        if (isValidPath(x, y)) {
            if (Math.abs(prevX - x) == 1 && Math.abs(prevY - y) == 1) {
                if (board.board[x][y] == null || board.board[x][y].getPlayers().getColor() != cell.getPlayers().getColor()) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean Queen(int x, int y) {
        int prevX = cell.getX();
        int prevY = cell.getY();
        if (isValidPath(x, y)) {
            if (Math.abs(prevX - x) == 1 && Math.abs(prevY - y) == 1) {
                if (board.board[x][y] == null || board.board[x][y].getPlayers().getColor() != cell.getPlayers().getColor()) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }
        }
        return false;
    }

    public boolean Rook(int x, int y) {
        int prevX = cell.getX();
        int prevY = cell.getY();
        if (isValidPath(x, y)) {
            if (Math.abs(prevX - x) == 1 && Math.abs(prevY - y) == 1) {
                if (board.board[x][y] == null || board.board[x][y].getPlayers().getColor() != cell.getPlayers().getColor()) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }
        }
        return false;
    }

    public boolean Bishop(int x, int y) {
        int prevX = cell.getX();
        int prevY = cell.getY();
        if (isValidPath(x, y)) {
            if (Math.abs(prevX - x) == 1 && Math.abs(prevY - y) == 1) {
                if (board.board[x][y] == null || board.board[x][y].getPlayers().getColor() != cell.getPlayers().getColor()) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }
        }
        return false;
    }

    public boolean Knight(int x, int y) {
        int prevX = cell.getX();
        int prevY = cell.getY();
        if (isValidPath(x, y)) {
            if (Math.abs(prevX - x) == 1 && Math.abs(prevY - y) == 1) {
                if (board.board[x][y] == null || board.board[x][y].getPlayers().getColor() != cell.getPlayers().getColor()) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }
        }
        return false;
    }

    public boolean Pawn(int x, int y) {
        int prevX = cell.getX();
        int prevY = cell.getY();
        if (isValidPath(x, y)) {
            if (Math.abs(prevX - x) == 1 && Math.abs(prevY - y) == 1) {
                if (board.board[x][y] == null || board.board[x][y].getPlayers().getColor() != cell.getPlayers().getColor()) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }
        }
        return false;
    }

    // public boolean empty(int[][] board, int x, int y) {

    // int rem = board[x][y];
    // if (rem) {
    // return true;
    // }
    // return false;
    // }
}
