package Divide_and_conquer;

import java.util.*;

public class quick {
    public static void print(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //quick sort function
    public static void quickSort(int arr[],int si,int ei){
        //base
        if(si>=ei){
            return ;
        }
        int PINX = partition(arr,si,ei);
        quickSort(arr, si, PINX-1);//for left 
        quickSort(arr, PINX+1, ei);//for right
    }

    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j = si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]= temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei]= arr[i];
        arr[i]=temp;
        return i;

    }
    public static void main(String[] args) {
       int arr[] ={1,5,4,2,5,7,3,3};
       quickSort(arr, 0, arr.length-1);
       print(arr);
       
    }
}
