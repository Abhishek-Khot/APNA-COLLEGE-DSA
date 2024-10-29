package array;

import java.util.Scanner;

public class swap_call {
    // value cant change because call by value
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        swap(num1,num2);
        System.out.println(num1);
        System.out.println(num2);
    }
    private static void swap(int num1,int num2){
        int temp = num1;
        num1 =num2;
        num2 =temp;
    }
    // in call by value the function get erased after returning the value but in reference the not erased because the changes are occur in heap;
}
