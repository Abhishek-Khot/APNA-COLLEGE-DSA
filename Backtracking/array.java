package Backtracking;

public class array {
    public static void display(int arr[]){
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void changearr(int arr[],int i,int val){
        if(i==arr.length){
            // System.out.print(arr);
            display(arr);
            return;
        }
        arr[i]=val;
        changearr(arr, i+1, val+1);
        //after returning from call stack decrease by two
        arr[i]=arr[i]-2;//back tracking
    }
    public static void main(String[] args) {
        int arr[]= new int[5];
        changearr(arr, 0, 1);
        display(arr);
    }
}
