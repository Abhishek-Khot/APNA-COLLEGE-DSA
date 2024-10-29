package recursion;

import java.util.*;

public class sumofn {
    public static int sum(int n){
        if(n==1){
            // System.out.print(1);
            return 1;
        }
        int ans = n+sum(n-1);
        return ans;
        
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =sum(n);
        System.out.println(ans);
    }
}
