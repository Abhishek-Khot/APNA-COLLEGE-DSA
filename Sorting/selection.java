package sorting;
import java.util.*;
public class selection {
    public static void selectionsort(int array[]) {
        for(int i =0;i<array.length-1;i++){
            int min=i;
            for(int j =i+1;j<array.length;j++){
                if(array[min]>array[j]){
                    min=j;
                }
            }
            int temp = array[min];
            array[min]=array[i];
            array[i]=temp;
        }
        for(int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size =sc.nextInt();
    int array[]=new int[size];
    for(int i =0;i<array.length;i++){
        array[i]=sc.nextInt();
    }
    selectionsort(array);
}
}