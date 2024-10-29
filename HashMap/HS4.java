package HashMap;

import java.util.*;

public class HS4 {
    public static int countDistinct(int arr[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        return hs.size();
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,5,6,7,3,4,2,1};
        System.out.println(countDistinct(arr));
    }
}
