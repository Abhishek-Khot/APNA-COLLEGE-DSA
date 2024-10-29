package STACKC;

import java.util.*;;

public class valid {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i =0;i<str.length();i++){
            char currChar = str.charAt(i);
            //for opening
            if(currChar=='('||currChar=='['||currChar=='{'){
                s.push(currChar);
            }
            //for closing
            else{
                //")))))))"-->check empty
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='('&&currChar==')')||(s.peek()=='{'&&currChar=='}')||(s.peek()=='['&&currChar==']')){
                s.pop();
                }
                //not able to form pairs
                else{
                    return false;
                }

            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str= "[](){}(";
        boolean ans = isValid(str);
        System.out.println(ans);

    }
}
