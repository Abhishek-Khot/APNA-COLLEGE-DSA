// sum of rows 2
package two_d_array;
import java.util.*;
public class a2 {

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
        int k =1;
        int ans =0;
        for(int j =0;j<m;j++){
            // System.out.println();
            ans+=array[k][j];
        }
        System.out.println(ans);
    }
}
