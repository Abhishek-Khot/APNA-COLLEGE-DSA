package Divide_and_conquer;

import java.util.*;

import array.pair;

import recursion2.removeduplicate;

public class modified {
    public static int search(int arr[],int tar,int si,int ei){
        //base

        int mid = si+(ei-si)/2;

        if(arr[mid]==tar){
            return mid;
        }
        //if lies on L1
        if(arr[si]<=arr[mid]){//important
            //left
            if(arr[si]<=tar&&tar<=arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            //right
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
        else{
            //left
            if(arr[si]<=tar&&tar<=arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            //right
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
    }

   public static void main(String[] args) {
    int arr[]= {4,5,6,7,0,1,2};
    int target = 7;
    int index = search(arr,target,0,arr.length-1);
    System.out.println(index);
   } 
}
