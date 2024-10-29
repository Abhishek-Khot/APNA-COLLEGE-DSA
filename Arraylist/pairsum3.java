package Arraylist;

import java.util.ArrayList;

public class pairsum3 {

    public static boolean pairSum(ArrayList<Integer> list,int target){
        //find breaking pointing
        int n = list.size();
        int breaking = -1;//initial to invalid index
        //breaking means pivot
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                breaking=i;
                break;
            }
        }
        //leftpointer is on smallest value
        int leftPointer = breaking+1;
        int rightPointer = breaking;
        while (leftPointer<rightPointer) {
            //case 1
            if(list.get(rightPointer)+list.get(leftPointer)==target){
                return true;
            }
            else if(list.get(rightPointer)+list.get(leftPointer)<target){
                leftPointer =(leftPointer+1)%n;
            }
            else{
                rightPointer =(n+rightPointer-1)%n;
            }
        }
        return false;


    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int target =6;

        System.out.println(pairSum(list,target));
    }
}
