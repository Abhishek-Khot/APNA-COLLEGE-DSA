package Heap;

import java.util.PriorityQueue;

public class Seven {
    static class Points implements Comparable<Points>{
        int x;
        int y;
        int maxDistSq ;
        int i ;
        Points(int x,int y,int maxDistSq,int i){
            this.x = x;
            this.y = y;
            this.maxDistSq = maxDistSq;
            this.i=i;
        }
        @Override
        public int compareTo(Points p2){
            //minimum
            return this.maxDistSq - p2.maxDistSq;
        }
    }
    public static void main(String[] args) {
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k =2;
        //push
        PriorityQueue<Points> pq = new PriorityQueue<>();
        for(int i =0;i<pts.length;i++){
            int maxDistSq = (pts[i][0]*pts[i][0])+(pts[i][1]*pts[i][1]);
            pq.add(new Points(pts[i][0],pts[i][1],maxDistSq,i));
        }
        //print the k elemetns
        for(int i=0;i<k;i++){
            System.out.println("C"+pq.peek().i);
            pq.remove();
        }

    }
}
