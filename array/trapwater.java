package array;
import java.util.*;
import java.lang.Math;
public class trapwater{
    
    public static int trapwaterr(int array[]){
        int n = array.length;
        //left array
        int maxleft[]=new int[n];
        maxleft[0]=array[0];
        for(int i =1;i<n;i++){
            maxleft[i] = Math.max(maxleft[i-1],array[i]);
        }
       
        //right array
        int maxright[]=new int[n];
        maxright[n-1]=array[n-1];
        for(int i =n-2;i>=0;i--){
            maxright[i] = Math.max(maxright[i+1],array[i]);
        }
        int trapwater =0;
        for(int i =0;i<n;i++){
            int waterlevel = Math.min(maxleft[i],maxright[i]);
            trapwater +=waterlevel-array[i];
        }
        return trapwater;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[]= new int[size];
        for(int i =0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        trapwaterr(array);
        System.out.println(trapwaterr(array));
    }
}
