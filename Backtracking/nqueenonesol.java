package Backtracking;

import java.util.*;



public class nqueenonesol {


        // counting the number of possible solutions
        static int count = 0;

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
            for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {// catch
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

        public static boolean nQueen(char board[][], int row) {
            // base case
            if (row == board.length) {
                // printBoard(board);
                count++;

                return true;
            }
            // placing queen in column
            for (int j = 0; j < board.length; j++) {
                // check is it safe
                if (isSafe(board, row, j)) {
                    // recursion
                    board[row][j] = 'Q';
                
                    if (nQueen(board, row + 1)) {// goes for next row
                      return true;
                    }
            }

                board[row][j] = 'X';// backtrack
            }

            return false;

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
            if (nQueen(board, 0)) {
                System.out.println("The solution is possible ");
                printBoard(board);

            } else {
                System.out.println("Solution is not possible");
            }

        }
    }
