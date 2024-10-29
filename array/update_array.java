package array;

import java.util.Scanner;

public class update_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size= sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements of array :");
        for(int i =0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        update(array);//address only
        // printing the elements of array 
        for(int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void update(int array[]) {
        for(int i =0;i<array.length;i++){//only .length for array and .length() for numbers
            array[i]+=1;
        }

        
    }
}
