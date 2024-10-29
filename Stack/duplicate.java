package STACKC;
import java.util.Stack;

public class duplicate {
    public static void main(String[] args) {
        //string
        String str = "(((a+b)))";//true
        String str2 = "(a+b)";//false
        boolean ans = isDuplicate(str2);
        System.out.println(ans);
    }
    public static boolean isDuplicate(String str){
        //stack
        Stack<Character> s = new Stack<>();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            int count = 0;
            //closing
            //if the stack contain ) then do
            if(ch==')'){//imp
                while (s.peek()!='(') {
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;//means duplicate
                }
                else{
                    s.pop();//pop ( this paratheses
                }
            }
            //opening comes push char in stack
            else{
                s.push(ch);
            }
        }
        return false;
    }
}
