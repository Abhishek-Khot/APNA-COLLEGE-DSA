package array;

import java.util.*;

public class pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size :");
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        pair(array);
    }
    public static void pair(int array[]) {
        int total =0;
        for(int i =0;i<array.length;i++){
            for(int j =i;j<array.length;j++){
                System.out.println("["+array[i]+","+array[j]+"]");
                total++;
            }
        }
        System.out.println("total number of pairs are :"+total);
        
    }
}
