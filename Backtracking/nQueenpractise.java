package Backtracking;

import java.util.*;

import Strings.cheak;

public class nQueenpractise {

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j <board.length; i--, j++) {//catch
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char board[][]) {
        System.out.println("\n----------------CHESS BOARD------------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void nQueen(char board[][], int row) {
        // base case
        if (row == board.length) {
            printBoard(board);
            return;
        }
        // placing queen in column
        for (int j = 0; j < board.length; j++) {
            // check is it safe
            if (isSafe(board, row, j)) {
                // recursion
                board[row][j] = 'Q';
                nQueen(board, row + 1);// goes for next row
                board[row][j] = 'X';// backtrack
            }

        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the order n -->n*n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueen(board, 0);
    }
}
