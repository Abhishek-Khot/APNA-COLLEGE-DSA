package STACKC;

import java.util.Stack;

import java.util.Collections;

public class reversethestring {
    public static String reverseTheString(String str){
        //push
        Stack<Character> s = new Stack<>();
        int idx =0;
        while (idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        //pop
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();//because converting from SB to String
    }


    public static void main(String[] args) {
        String str = "abc";
        
        String result = reverseTheString(str);
        System.out.println(result);
    }
}
