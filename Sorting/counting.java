package sorting;
import java.util.Scanner;

public class counting {

    public static void hello(int array[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<array.length;i++){
            largest =Math.max(largest, array[i]);
        }
        int count[]=new int[largest+1];//+1 includeing zero also
        for(int i =0;i<array.length;i++){
            count[array[i]]++;
        }
        int j = 0;
        for(int i =0;i<count.length;i++){
            while (count[i]>0) {
                array[j]=i;
                j++;
                count[i]--;
            }
        }


    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int array[] = new int[size];
        int array[] = { 1, 5, 7, 3, 4, 2 };
        hello(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}


