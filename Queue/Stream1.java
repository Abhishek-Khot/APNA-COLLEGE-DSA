package QUEUE;

import java.util.*;

import java.util.LinkedList;;

public class Stream1 {
    public static void printNonRepeatingchar(String str){
        int freq[]=new int[26];
        Queue<Character> q = new LinkedList<>();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;//index value ++ if 0 then one if one then two like that
            while (!q.isEmpty() && freq[q.peek()-'a']>1) {
                //q.peek()-'a' it will return the first element -'a' means that character 
                //index so value of freq is > 1 then true
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }
            else{
                System.out.print(q.peek()+" ");//return the first element
            }

        }
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeatingchar(str);
    }
}
