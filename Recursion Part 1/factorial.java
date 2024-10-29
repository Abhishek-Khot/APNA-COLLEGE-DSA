package recursion;

import java.util.*;

public class factorial {
    public static int fact(int n){
        if(n==0){
            // System.out.print(1);
            return 1;
        }
        int ans = fact(n-1);
        int ans2= n*ans;
        return ans2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =fact(n);
        System.out.println(ans);
    }
}
