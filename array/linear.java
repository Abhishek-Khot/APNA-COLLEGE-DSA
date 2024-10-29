package array;

import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size= sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements of array :");
        for(int i =0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the key to be found :");
        int key = sc.nextInt();
        int ans =linearSearch(array,key);
        if(ans == -1){
            System.out.println("Not found at any indez=x ");
        }
        else{
            System.out.println("found at index "+ans);
        }

        
    }
    public static int linearSearch(int array[],int key) {
        for(int i =0;i<array.length;i++){
            if(array[i]==key ){
                return i;
            }
        }
        return -1;

        
    }
}
