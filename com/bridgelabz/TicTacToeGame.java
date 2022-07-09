package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
    public static char[] gameBoard = new char[10];
    public static char playerTurn;
    public static char computerTurn;
    public static char user = '1';
    public static Scanner scanner = new Scanner(System.in);

    //Main method
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe game");
        showBoard();
        player();

    }

    //Method to print the game board
    public static void showBoard() {

        System.out.println(gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2]);
        System.out.println(gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5]);
        System.out.println(gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8]);
    }

    //Method for user to choose among X or 0
    public static char player() {
        System.out.println("Enter your choice -> (X or O) only");
        return scanner.next().toUpperCase().charAt(0);
    }
}
