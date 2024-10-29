package Graph;

import java.util.ArrayList;

public class One {
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }   
    }
    public static void main(String[] args) {
        int V = 5;                                  //number of vertices
       ArrayList<Edge>[] graph = new ArrayList[V];//created a array but not initial with arraylist so here the null is stored
       for(int i =0;i<V;i++){
            graph[i]= new ArrayList<>();
       }
       //for 0 vertex
       graph[0].add(new Edge(0, 1, 5));

       //for 1 vertex
       graph[1].add(new Edge(1, 0, 5));
       graph[1].add(new Edge(1, 2, 1));
       graph[1].add(new Edge(1, 3, 3));

       //for 2 vertex
       graph[2].add(new Edge(2, 4, 2));
       graph[2].add(new Edge(2, 3, 1));
       graph[2].add(new Edge(2, 1, 1));

       //for 3 vertex
       graph[3].add(new Edge(3, 2, 1));
       graph[3].add(new Edge(3, 1, 3));

       //for 4 vertex
       graph[4].add(new Edge(4, 2, 2));
       
       //finding the neighour of 2
       for(int i =0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest);
       }
    }
}
