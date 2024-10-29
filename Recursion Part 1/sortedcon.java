package recursion;

import java.util.*;

public class sortedcon {
    public static boolean isSorted(int array[], int i) {
        if (i == array.length - 1) {
            return true;// base case
        }
        if (array[i] > array[i + 1]) {
            return false;// cheak first condition then go for next
        }
        return isSorted(array, i + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = { 1, 2, 3, 4, 5 };// here 1 is index zero
        isSorted(array, 0);// index zero to last
        System.out.println(isSorted(array, 0));
    }
}
