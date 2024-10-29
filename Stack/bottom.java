package STACKC;

import java.util.Stack;

public class bottom {
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        //pop all elements
        int top = s.pop();
        pushAtBottom(s, data);//remove then store data and below will do push 
        s.push(top);//push elements which are poped
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s,4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());//for printing the elt in lifo
        }
    }
}
