package array;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size= sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements of array :");
        for(int i =0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int large =largest(array);
        int small =smallest(array);
        System.out.println("largest integer is"+large);
        System.out.println("small integer is"+small);

    }
    public static int largest(int array[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<array.length;i++){
            if(largest<array[i]){
                largest=array[i];
            }
        }
        return largest;
    }
    public static int smallest(int array[]){
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<array.length;i++){
            if(smallest>array[i]){
                smallest=array[i];
            }
        }
        return smallest;
    }
}
