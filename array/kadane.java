package array;

import java.util.Scanner;

public class kadane {
    public static int maxsumis(int array[]){
        int currsum = 0;
        int maxsum= Integer.MIN_VALUE;
        for(int i =0;i<array.length;i++){
            currsum = currsum+array[i];
            if(currsum<0){
                currsum =0;
            }
            maxsum= Math.max(maxsum, currsum);
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

        System.out.println(maxsumis(array));
    }
    }

