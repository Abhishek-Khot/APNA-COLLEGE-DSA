package two_d_array;
import java.util.*;

public class a1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int n = sc.nextInt();
        int array[][]=new int[m][n];
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                array[i][j]=sc.nextInt();
            }
        }
        int ans =0;
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
               System.out.print(array[i][j]+" ");
               ans+=array[i][j];
            }
            System.out.println();
        }
        System.out.println("SUM OF MATRIX ELEMENTS IS "+ans);
    }
}