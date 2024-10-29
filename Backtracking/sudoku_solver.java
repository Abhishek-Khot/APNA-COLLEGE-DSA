package Backtracking;

import recursion2.removeduplicate;

public class sudoku_solver {
    public static void printSolution(int sudoku[][]){
        for(int i =0;i<9;i++){
            for(int j =0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 0, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };
        if(solveSoduku(sudoku, 0, 0)){
            System.out.println("Solution exist");
            printSolution(sudoku);
        }
        else{
            System.out.println("Solution doesn't exist");
        }
    }

    public static boolean solveSoduku(int sudoku[][], int row, int col) {
        // base case
        //the recursion is goes until the last place
        if(row==9&&col==0){
            return true;
        }
        
        ///recursive call

        int nextCol=col+1;
        int nextRow =row;
        if(col+1==9){
            nextRow =row+1;
            nextCol = 0;
        }
        //condition for already set elements
        if(sudoku[row][col]!=0){
            return solveSoduku(sudoku, nextRow, nextCol);
        }

        //condition to place the elements
        for(int digit =0;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(solveSoduku(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;

    }
    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
        //0 to 8 become index numbers
        //column
        for(int i =0;i<=8;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //row
        for(int j =0;j<=8;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        //for 3*3 grid ke liye
        for(int i =sr;i<sr+3;i++){
            for(int j =sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
}
