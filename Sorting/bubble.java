package sorting;

import java.util.Scanner;

public class bubble {
    public static void bubblesort(int array[]){
        for(int i = 0;i<array.length-1;i++){
            for(int j = 0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int array[] = new int[size];
        int array[]={1,5,7,3,4,2};
        bubblesort(array);
        for(int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }
        
    }

}
