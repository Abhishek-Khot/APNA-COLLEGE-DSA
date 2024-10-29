package array;

import java.util.Scanner;

public class swap_reference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int array[] = new int[100];
        array[0]=sc.nextInt();
        array[1]=sc.nextInt();
        swap(array);
        for(int i =0;i<2;i++){
            System.out.println("after swap "+array[i]);
        }
    }
    public static void swap(int array[]) {
        int temp = array[0];
        array[0]=array[1];
        array[1]=temp;
        
    }
}
