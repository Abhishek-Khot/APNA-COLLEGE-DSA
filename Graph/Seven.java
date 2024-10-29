package Graph;

import java.util.*;

public class Seven {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src= s;
            this.dest = d;
        }
    }
    public static void GraphCreate(ArrayList<Edge>[] graph){
        //initialize with arraylist
        for(int i = 0;i<graph.length;i++){
            graph[i]= new ArrayList<>();
        }
        //for 0 vertex
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        //for 1 vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        //for 2 vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        //for 3 vertex
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        //for 4 vertex
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));


    }
    //bipartite
    public static boolean Bipartite(ArrayList<Edge>[] graph){
        int[] col = new int[graph.length];
        //initialize with no color
        for(int i =0;i<graph.length;i++){
            col[i]= -1;
        }
        Queue<Integer> q = new LinkedList<>();
        //bfs for every component of graph
        for(int i =0;i<graph.length;i++){
            if(col[i]==-1){
                //add the source into the queue
                q.add(i);
                col[i]=0;
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for(int j =0;j<graph[curr].size();j++){
                        Edge e = graph[curr].get(j);
                        //case 3-->not colored
                        if(col[e.dest]==-1){
                            int nextCol = col[curr]==0?1:0;
                            col[e.dest]=nextCol;
                            q.add(e.dest);
                        }
                        //case 1 neighbour is colored with same color
                        else if(col[e.dest]==col[curr]){
                            return false;
                        }
                        //case 2 :if colored different do nothing

                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        GraphCreate(graph);
        System.out.println(Bipartite(graph));
    }
}
