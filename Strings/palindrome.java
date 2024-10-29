package Strings;

import java.util.Scanner;

public class palindrome {
    public static boolean cheakpali(String name){
        for(int i = 0;i<name.length()/2;i++){
        if(name.charAt(i)==name.charAt(name.length()-1-i)){
      return true;
    }
}
return false;
   }
        
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine() ;
    boolean ans= cheakpali(name);
    System.out.println(ans);
    }


}

