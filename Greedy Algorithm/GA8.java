package Greedy;

import java.util.Arrays;
import java.util.Collections;

public class GA8 {
    public static void main(String[] args) {
        int n = 4;
        int m = 6;

        Integer[] costVer = {2,1,3,1,4 };
        Integer[] costHor = {4,1,2};
        //array of object 
        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());

        int v = 0, h = 0;
        int vp = 1, hp = 1;
        int cost = 0;
        while (h < costHor.length && v < costVer.length) {
            if (costHor[h] >= costVer[v]) {
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }
        System.out.println("Minimum cost to cut the chocolate is "+cost);
    }

}