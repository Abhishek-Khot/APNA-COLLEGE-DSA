package Strings;

import java.util.*;

import java.lang.Math;

public class shortest {
    public static float shorte(String str){
        int x =0;
        int y =0;
        for(int i=0;i<str.length();i++){
            char path = str.charAt(i);
            if(path=='N'){
                y++;
            }
            else if(path=='S'){
                y--;
            }
            else if(path=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2 =x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(shorte(name));
    }
}
