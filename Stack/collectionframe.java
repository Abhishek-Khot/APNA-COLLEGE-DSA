package STACKC;

import java.util.Collections;

import java.util.ArrayList;

import java.util.Stack;

public class collectionframe {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for(int i =1;i<4;i++){
            s.push(i);
        }
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}