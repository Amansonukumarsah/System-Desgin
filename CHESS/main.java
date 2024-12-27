package CHESS;

public class main {

    public static void main(String args[]) {
        System.out.println("Best of luck! The game has begun!");
        chessController chess = new chessController();
        String winner = chess.gameStart();
        if (winner.equals("tie")) {
            System.out.println("Game is Tie!!!");
            System.out.println("Better Luck Next Time");
        } else {
            System.out.println("Winner of the game is" + winner);
        }
    }
}
