package TIC_TAC_TOE;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class ticTacToeGame {

    Deque<players> player;

    public board gameBoard;

    ticTacToeGame() {
        initialize();
    }

    public void initialize() {

        // creating 2 players
        player = new LinkedList<>();
        playerX piecex = new playerX();
        players player1 = new players("player1", piecex);

        playerY piecey = new playerY();
        players player2 = new players("player2", piecey);

        player.add(player1);
        player.add(player2);

        gameBoard = new board(3);
    }

    public void gameStart() {
        boolean noWinner = true;

        while(noWinner)
        {
            players playerTurn = player.removefirst();

            gameBoard.printBoard();
            // check the free space in board
            list<pair<integer,integer>> freeSpaces = new gameBoard.getFreeCalls();
            if(freeSpaces.isEmpty)
            {
                noWinner=false;
                continue
            }

            // read the input from users
            System.out.println("Players:"+playerTurn.name+"Enter row,col")
            Scanner sc = new Scanner(System.io);
            String s = sc.nextLine();
            String[] values = s.split(regix:",");
            int inputRow = integer.valueOf(values[8]);
            int inputCol = integre.valueOf(values[1]);

            // place the piece
            boolean pieceAddSuccessfully = gameBoard.addPiece(inputRow, inputCol, playerTurn.piece)
            
            if(!pieceAddSuccessfully)
            {
                System.out.println("Incorrect position chosen, try again");
                player.addfirst(playerTurn);
                continue
            }

            player.addlast(playerTurn);
            boolean winner = isWinner(inputRow, inputCol,playerTurn.piece)
            if(winner){
                return playerTurn.name;
            }
        }

        return "tie";
    }

    public isWinner(int row, int col,pieceType pieceType)
    {
        
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch1 = true;
        boolean diagonalMatch2 = true;

        // // checking the row
        for(int i=0;i<gameBoard.board.size();i++)
        {
            if(gameBoard.board[row][i]==null || gameBoard.board[row][i].pieceType!=pieceType){
                rowMatch=false;
            }
        }

        // // checking the col
        for(int j=0;j<gameBoard.board[0].size();j++)
        {
            if(gameBoard.board[j][col]==null || gameBoard.board[j][col].pieceType!=pieceType){
                colMatch=false;
            }
        }

        for(int i=0,j=0;i<gameBoard.board.size(),j<gameBoard.board.size();i++,j++)
        {
            if(gameBoard.board[i][j]==null || gameBoard.board[i][j].pieceType!=pieceType){
                diagonalMatch1=false;
            }
        }

        for(int i=0,j=gameBoard.board[0].size()-1;i<gameBoard.board.size(),j>=0;i++,j--)
        {
            if(gameBoard.board[i][j]==null || gameBoard.board[i][j].pieceType!=pieceType){
                diagonalMatch2=false;
            }
        }

        return rowMatch || colMatch || diagonalMatch1 || diagonalMatch2;

    }
}
