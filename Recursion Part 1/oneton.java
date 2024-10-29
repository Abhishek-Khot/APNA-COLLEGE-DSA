package recursion;

import java.util.*;

public class oneton {
    public static void increase(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        increase(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        increase(n);
    }
    
}
