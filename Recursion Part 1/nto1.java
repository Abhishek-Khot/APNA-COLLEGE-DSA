package recursion;
import java.util.*;
public class nto1 {
    public static void decrese(int n ){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+ " ");
        decrese(n-1);
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    decrese(n);
   } 
}
