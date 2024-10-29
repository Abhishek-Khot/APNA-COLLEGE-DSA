package Backtracking;

public class gridWays {
    public static void main(String[] args) {
        int n=16;int m=16;
        int ans =findGridWays(0,0,n,m);
        System.out.println("Total number of possible ways are = "+ans);

    }
    public static int findGridWays(int i ,int j,int n,int m){
        //i and j is starting
        //base condition
        if(i==n-1&&j==m-1){
            //if we are standing on the target
            return 1;
        }
        else if(i==n||j==n){
            //check is it inside the grid
            return 0;
        }
        int w1 = findGridWays(i+1, j, n, m);
        int w2 = findGridWays(i, j+1, n, m);
        return w1+w2;
    }
}
