package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
    public static char[] gameBoard = new char[10];
    public static char user = '1';
    public static char userTurn;
    public static int userPos;
    public static Scanner scanner = new Scanner(System.in);

    //Main method
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe program");
        showBoard();
        player();
        ticTacToe();
        moveLocation();
    }

    //Method to print the game board
    public static void showBoard() {

        System.out.println(gameBoard[1] + " | " + gameBoard[2] + " | " + gameBoard[3]);
        System.out.println(gameBoard[4] + " | " + gameBoard[5] + " | " + gameBoard[6]);
        System.out.println(gameBoard[7] + " | " + gameBoard[8] + " | " + gameBoard[9]);
    }

    //Method for user to choose among X or 0
    public static char player() {
        System.out.println("Enter your choice -> (X or O) only");
        return scanner.next().toUpperCase().charAt(0);
    }

    //Board with empty spaces
    public static void ticTacToe() {
        for (int i = 0; i < gameBoard.length; i++) {

            gameBoard[i] = ' ';
        }
    }//User choose location in board from 1 to 9
    public static void moveLocation() {
        if (user == '1') {
            System.out.print("\nSelect the position in board from range [1 - 9] : ");
            userPos = scanner.nextInt();

            switch (userPos) {
                case 1:
                    if (gameBoard[1] == ' ') {
                        gameBoard[1] = userTurn;
                    }
                    break;

                case 2:
                    if (gameBoard[2] == ' ') {
                        gameBoard[2] = userTurn;
                    }
                    break;

                case 3:
                    if (gameBoard[3] == ' ') {
                        gameBoard[3] = userTurn;
                    }
                    break;

                case 4:
                    if (gameBoard[4] == ' ') {
                        gameBoard[4] = userTurn;
                    }
                    break;

                case 5:
                    if (gameBoard[5] == ' ') {
                        gameBoard[5] = userTurn;
                    }
                    break;

                case 6:
                    if (gameBoard[6] == ' ') {
                        gameBoard[6] = userTurn;
                    }
                    break;

                case 7:
                    if (gameBoard[7] == ' ') {
                        gameBoard[7] = userTurn;
                    }
                    break;

                case 8:
                    if (gameBoard[8] == ' ') {
                        gameBoard[8] = userTurn;
                    }
                    break;

                case 9:
                    if (gameBoard[9] == ' ') {
                        gameBoard[9] = userTurn;
                    }
                    break;

                default:
                    System.out.println("Invalid Position");
            }
        }
    }
}
