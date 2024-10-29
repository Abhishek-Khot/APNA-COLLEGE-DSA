package Backtracking;

public class arrback {
    public static void display(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void arraybacktracking(int arr[],int i,int val){
        //base
        if(i==arr.length){
            display(arr);
            return;
        }
        arr[i]=val;
        arraybacktracking(arr, i+1, val+1);
        arr[i]=arr[i]-2;//back tracking

    }


    public static void main(String[] args) {
        int arr[]=new int[5];
        arraybacktracking(arr, 0, 1);
        display(arr);
    }
}
