package STACKC;

import java.util.*;

import java.util.Stack;

public class reverse {
    //code for push at botton
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void reverseTheStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseTheStack(s);
        pushAtBottom(s, top);
    }
    public static void print(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseTheStack(s);
        print(s);
    }
}
