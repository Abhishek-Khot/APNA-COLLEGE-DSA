package Strings;
import java.util.*;

public class substringnot {
    // package Strings;
    public static void substring(String str,int si,int ei){
        String ans ="";
        for(int i =si;i<ei;i++){
            ans+=str.charAt(i);
        }
        // System.err.println();
        System.out.println(ans);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("enter last and first index ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        substring(name, a, b);

    }
}


