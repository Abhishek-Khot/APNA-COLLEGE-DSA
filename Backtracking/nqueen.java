package Backtracking;

public class nqueen {
    public static boolean isSafe(char board[][],int row,int col){
        //for vertical
        for(int i = row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left
        for(int i = row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right
        // for(int i =row-1,j= col+1;i>=0&&j<=0;i--,j++){
        //agar minus to 0 tak||agar plus hai toh board.length tak
            for(int i =row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            //board lenght 5 then 4 is last col
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;

    }
    public static void nQueen(char board[][],int row){
        //base case-->max parameter goes
        
        if(row == board.length){
            printBoard(board);
            
            return;
        }
        
        
        //places the queen on each column
        for(int j =0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueen(board, row+1);
               //backtracking to erase that queen that is already palced -->to place another queen
                board[row][j]='X';

            }
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("\n--------------Chess board-------------");
        for(int i =0;i<board.length;i++){
            for(int j = 0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 10;
        char board[][] = new char[n][n];
        //initilize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='X';

            }

        }
        nQueen(board,0);//board and row

    }
}
