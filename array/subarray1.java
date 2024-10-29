package array;

import java.util.*;

public class subarray1{
    public static int sub(int array[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum =0;
        for(int i =0;i<array.length;i++){
            int start = i;
            for(int j = i;j<array.length;j++){
               int  end = j;
               currsum =0;
                for(int k =start;k<=end;k++){
                    // System.out.println();
                    currsum+=array[k];
                }

                if(currsum>maxsum){
                    maxsum=currsum;
                }
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int array[]=new int[size];
        for(int i =0;i<array.length;i++){
            array[i]=sc.nextInt();
        }

        System.out.println(sub(array));
    }
}