package sorting;

import java.util.*;


public class selection1 {
    public static void selectionsort(int array[]){
        for(int i =0;i<array.length-1;i++){
            int minpos=i;
            for(int j = i+1;j<array.length;j++){
                if(array[minpos]<array[j]){
                    minpos = j;
                }
            }
            int temp = array[minpos];
            array[minpos]=array[i];
            array[i]=temp;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int array[] = new int[size];
        int array[] = { 1, 5, 7, 3, 4, 2 };
        selectionsort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}