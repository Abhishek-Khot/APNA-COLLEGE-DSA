package recursion2;

import array.kadane;
import array.pair;

public class assignment {
    public static void search(int arr[],int idx,int key){
        if(idx == arr.length){
            // System.out.println("NOT FOUND");
            return;
        }
        if(arr[idx]==key){
            System.out.println(idx);

        }
        search(arr, idx+1, key);

    }

    public static int lengthOfString(int idx,int count,String str){
        if(idx == str.length()){
            return 0;
        }
        else{
            count++;
        }
        return lengthOfString(idx+1, count, str);
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        search(arr,0,2);
        int ans =lengthOfString(0, 0, "hello world");
        System.out.println(ans);
    }
}
