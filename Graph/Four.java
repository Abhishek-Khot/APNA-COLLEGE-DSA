package Graph;

import java.util.*;


public class Four {
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
    //haspath
    public static boolean isPath(ArrayList<Edge>[] graph,int source ,int destination,boolean Visited[]){
        if(source == destination){
            return true;
        }
        Visited[source]= true;
        //source ke neighours me find kar rahe hai graph[sournce].size()
        for(int i =0;i<graph[source].size();i++ ){
            Edge e = graph[source].get(i);
            if(!Visited[e.dest]&&isPath(graph, e.dest, destination, Visited)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v = 8;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        boolean ans = isPath(graph, 0, 5,new boolean[v]);
        System.out.println(ans);
        
       
    }
}