package Divide_and_conquer;

public class merge {
    public static void printing(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void MergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return ;
        }
        int mid = si+(ei-si)/2;
        MergeSort(arr, si, mid);
        MergeSort(arr, mid+1, ei);
        Merge(arr,si,mid,ei);
    }
    public static void Merge(int arr[],int si,int mid,int ei){
        //ei - si +1 due to zero based indexing
        int temp[]=new int[ei-si+1];
        //part one
        int i = si;//ending iterator
        //part two
        int j = mid+1;//starting iterator
        int k =0;//temp iterator
        while (i<=mid&&j<=ei) {//start to mid and mid+1 to end
            if(arr[i]<arr[j]){//compare between two parts and small is stored
                temp[k]=arr[i];//store int temp array
                i++;
                k++;
            }
            else{
                temp[k]=arr[j];
                j++;
                k++;
            }
            
        }
        //remaining lefts
        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        //remaining right
        while (j<=ei) {
            temp[k++]=arr[j++];
        }
        //iterate for two array one is original i and another is 
        //temp array and copy to original array 
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[]={2,3,7,5,4,2,5};
        MergeSort(arr, 0, 6);
        printing(arr);
    }
}
