package CHESS;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class chessController {

    board board;
    players player;
    pieces piece;

    Deque<players> queue = new ArrayDeque<>();

    chessController() {
        // this function basicaaly set the value in board
        initialize();
    }

    // set the value in board according
    public void initialize() {
        for (int i = 0; i < 2; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Name");
            String name = sc.nextLine();
            System.out.println("Chose the color of white or black");
            String color = sc.nextLine();
            board.initializeBoard(name, color, i);
            queue.addFirst(new players(name, color));
        }
    }

    public String gameStart() {
        while (queue.isEmpty()) {
            players player1 = queue.getFirst();
            System.out.println(player1.getName() + "Now Your Turn!! your piece is " + player1.getColor());
            System.out.println("please Enter the Name of piece!!");
            Scanner sc = new Scanner(System.in);
            String pieceName = sc.nextLine();
            System.out.println("please Enter the place you want to place!!");
            int x = sc.nextInt(), y = sc.nextInt();

            moves move = new moves();
            boolean valid;

            if (pieceName.toLowerCase() == "bishop") {
                valid = move.Bishop(x, y);
                if (valid) {
                    board.board[x][y] = new cell(player1, piece, x, y);
                    System.out.println("Your Pieces Placed");
                    players player = queue.pollFirst();
                    queue.addLast(player);
                    continue;
                } else {
                    System.out.println("Please Enter a Valid Position");
                    players player = queue.pollFirst();
                    queue.addLast(player);
                    continue;
                }
            } else if (pieceName.toLowerCase() == "king") {
                valid = move.King(x, y);
                if (valid) {
                    board.board[x][y] = new cell(player1, piece, x, y);
                    System.out.println("Your Pieces Placed");
                    players player = queue.pollFirst();
                    queue.addLast(player);
                    continue;
                } else {
                    System.out.println("Please Enter a Valid Position");
                    players player = queue.pollFirst();
                    queue.addLast(player);
                    continue;
                }
            } else if (pieceName.toLowerCase() == "queen") {
                valid = move.Queen(x, y);
                if (valid) {
                    board.board[x][y] = new cell(player1, piece, x, y);
                    System.out.println("Your Pieces Placed");
                    players player = queue.pollFirst();
                    queue.addLast(player);
                    continue;
                } else {
                    System.out.println("Please Enter a Valid Position");
                    continue;
                }
            } else if (pieceName.toLowerCase() == "rook") {
                valid = move.Rook(x, y);
                if (valid) {
                    board.board[x][y] = new cell(player1, piece, x, y);
                    board.board[x][y] = new cell(player1, piece, x, y);
                    players player = queue.pollFirst();
                    queue.addLast(player);
                    System.out.println("Your Pieces Placed");
                    continue;
                } else {
                    System.out.println("Please Enter a Valid Position");
                    continue;
                }
            } else if (pieceName.toLowerCase() == "knight") {
                valid = move.Knight(x, y);
                if (valid) {
                    board.board[x][y] = new cell(player1, piece, x, y);
                    board.board[x][y] = new cell(player1, piece, x, y);
                    System.out.println("Your Pieces Placed");
                    players player = queue.pollFirst();
                    queue.addLast(player);
                    continue;
                } else {
                    System.out.println("Please Enter a Valid Position");
                    continue;
                }
            } else if (pieceName.toLowerCase() == "pawn") {
                valid = move.Pawn(x, y);
                if (valid) {
                    board.board[x][y] = new cell(player1, piece, x, y);
                    board.board[x][y] = new cell(player1, piece, x, y);
                    System.out.println("Your Pieces Placed");
                    players player = queue.pollFirst();
                    queue.addLast(player);
                    continue;
                } else {
                    System.out.println("Please Enter a Valid Position");
                    continue;
                }
            }
        }
        return "Tie";
    }

}
