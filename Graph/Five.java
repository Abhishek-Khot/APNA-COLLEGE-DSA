package Graph;

import java.util.*;

public class Five {
    static class Edge {
        int src;
        int dest;
        int wt;
        Edge(int s ,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }    
    }
    //creating a graph
    public static void createGraph(ArrayList<Edge>[] graph){

        for(int i =0;i<graph.length;i++){
            graph[i]= new ArrayList<>();
        }
        //we take wt == 1(by default) --> no need to take
        //0 vertex
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        //1 vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        //2 vertex
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        //3 vertex
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        //4 vertex
        graph[4].add(new Edge(4, 2, 1));     
        graph[4].add(new Edge(4, 3, 1));     
        graph[4].add(new Edge(4, 5, 1));   
        
        //5 vertex
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        //6 vertex
        graph[6].add(new Edge(6, 5, 1));

    }
    //DFS for disjoint components
    public static void DFS(ArrayList<Edge>[] graph){
        boolean Visited[]= new boolean[graph.length];
        for(int i =0;i<graph.length;i++){
            if(!Visited[i]){
                DFSUTIL(graph, i, Visited);
            }
        }
    }
    public static void DFSUTIL(ArrayList<Edge>[] graph,int curr,boolean Visited[]){
        System.out.print(curr+" ");
        Visited[curr]=true;
        for(int i =0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!Visited[e.dest]){
                DFSUTIL(graph, e.dest, Visited);
            }
        }
    }
    //BSF for disjoint components
    public static void BFS(ArrayList<Edge>[] graph){
        boolean Visited[]= new boolean[graph.length];
        for(int i =0;i<graph.length;i++){
            if(!Visited[i]){
                BFSUTIL(graph, Visited);
            }
        }

    }
    public static void BFSUTIL(ArrayList<Edge>[] graph,boolean Visited[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if(!Visited[curr]){
                System.out.print(curr+" ");
                Visited[curr]= true;
                for(int i =0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

        
    }
    public static void main(String[] args) {
        int v = 7;//give number of nodes here
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        DFS(graph);
        System.out.println();
        BFS(graph);
    }
}
