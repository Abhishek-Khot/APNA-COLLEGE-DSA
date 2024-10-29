package Strings;

import java.util.*;

// for example 
// abhishek khot
// output : Abhishek Khot
public class code_nation {
    public static void capital(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&&str.length()-1>0){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }
            else{
                sb.append(i);

            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // StringBuilder sb = new StringBuilder("");
        // char helo= sb.toUpperCase(sb.charAt(0));


    }
}
