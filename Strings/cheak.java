package Strings;

import java.util.*;

import array.reverse_less_memo;

public class cheak {
    public static boolean check(String str){
        for(int i =0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if(check(name)){
            // System.err.println("");
            System.out.println("palindrome ");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}
