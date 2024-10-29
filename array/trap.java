package array;

import java.util.*;

public class trap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int h[]=new int[n];
        for(int i =0;i<h.length;i++){
            h[i]=sc.nextInt();
        }
        trap(h);
        System.out.println(trap(h));
    }
    public static int trap(int h[]){
        int n = h.length;
        // left side
        int l[]=new int[n];
        l[0]=h[0];
        for(int i =1;i<n;i++){
            l[i]=Math.max(h[i], l[i-1]);
        }

        // right side
        int r[] = new int[n];
        r[n-1]=h[n-1];
        for(int i=n-2;i>=0;i--){
            r[i]=Math.max(h[i], r[i+1]);
        }
        // w=total trap water
        int w =0;
        for(int i =0;i<n;i++){
            int x =Math.min(l[i],r[i] );
            w +=(x-h[i]);
        }
        return w;

    }
}
