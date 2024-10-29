package array;

import java.util.*;

public class subarray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");

		int size = sc.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();

		}
		sub(array);

	}

	public static void sub(int array[]) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
            int start = i;
			for (int j = i; j < array.length; j++) {
                int end = j;
                
				for (int k = start; k <=end; k++) {
					System.out.print(array[k]+" ");
                    sum +=array[k];
                    System.out.print(" "+sum);
				}
            
				System.out.println();
			}
			System.out.println();
		}
	}
}