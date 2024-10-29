package sorting;

import java.util.Scanner;

public class insetion {
    public static void insetionsort(int array[]){
        for(int i =0;i<array.length;i++){
            int curr=array[i];
            int prev = i-1;
            while (prev>=0&&array[prev]>curr) {
                array[prev+1]=array[prev];
                prev--;
            }
            array[prev+1]=curr;
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int array[] = new int[size];
        int array[] = { 1, 5, 7, 3, 4, 2 };
        insetionsort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
