package com.bridgelabz;

public class TicTacToeGame {
    public static char[] gameBoard = new char[10];

    //Method to create the board
    public static void showBoard() {
        System.out.println(gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2]);
        System.out.println(gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5]);
        System.out.println(gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8]);
    }

    //Main method
    public static void main(String[] args) {
        System.out.println("Welcome to tic tac toe program");
        System.out.println("The game board with 9 spaces is as follows");
        showBoard();
    }
}
