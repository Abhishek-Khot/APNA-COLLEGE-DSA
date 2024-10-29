package array;

import java.util.*;

public class reverse_less_memo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int size = sc.nextInt();
        int array[]=new int[size];
        for(int i = 0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        reverse(array);
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void reverse(int array[]){
        int length = array.length;
        int start = 0;
        int end = length-1;
        // for( start=0;start<=end;start++,end--) {
        //     int temp = array[end];
        //     array[end ]=array[start];
        //     array[start]=temp;

        // } apporach two
        while (start<=end) {
            int temp = array[end];
            array[end ]=array[start];
            array[start]=temp;
            start++;
            end--;

            
        }
    }
}
