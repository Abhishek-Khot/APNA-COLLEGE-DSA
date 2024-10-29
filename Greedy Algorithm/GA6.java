package Greedy;

import java.util.*;

public class GA6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        // int coins[] = {1,2,5,10,20,50,100,200,500,2000};-->because the comparator will work only on the non primitive 

        Integer coins[] = {1,2,5,10,20,50,100,200,500,2000};

        Arrays.sort(coins,Comparator.reverseOrder());
        
        int countNoOfCoins =0;
        ArrayList<Integer> ans = new ArrayList<>();
        int amount = n;

        for(int i =0;i<coins.length;i++){
            if(coins[i]<=amount){
                while (coins[i]<=amount) {
                    //for looping at same coin
                    countNoOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                    
                }
            }
        }
        System.out.println("Minimum number of coins is should give is "+countNoOfCoins);

        for(int i =0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }


    }
}
