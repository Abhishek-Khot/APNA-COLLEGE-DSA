package array;

import java.util.*;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        
        for(int i =0;i<array.length;i++){
            if((i+1) < array.length && array[i]>array[i+1]){
                System.out.println("Not a sorted array");
                System.exit(0);
            }
        }
        System.out.println("Enter key :");

        int key = sc.nextInt();

        System.out.println(key);
        int ans = binarySearch(array, key);
        System.out.println(ans);
        if (ans == -1) {
            System.out.println("Not found ");
        } else {
            System.out.println("Found at index: " + ans);
        }

    }

    public static int binarySearch(int array[], int key) {
        int length = array.length;
        int start = 0;
        int end = length - 1;// or end = array.length -1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] < key) {
                start = mid + 1;
            }
            if (array[mid] > key) {
                end = mid - 1;
            }
        }
        return -1;
    }

}
