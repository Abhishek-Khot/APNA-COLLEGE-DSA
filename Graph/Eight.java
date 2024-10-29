package Graph;

import java.util.ArrayList;

public class Eight {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src =s;
            this.dest =d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        //null is present in graph array
        for(int i =0;i<graph.length;i++){
            graph[i]= new ArrayList<>();
        }
        //acyclic
        // graph[0].add(new Edge(0, 2));;

        // graph[0].add(new Edge(0, 1));
        // graph[1].add(new Edge(1, 3));
        // graph[2].add(new Edge(2, 3));
        //cyclic graph
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(2, 0));

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(1, 0));

        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(3, 1));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(3, 2));
        
    }
    //main function
    public static boolean iscyclic(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];
        //for disjoint components
        for(int i =0;i<graph.length;i++ ){
            if(!vis[i]){
                if(iscyclicUTIL(graph,vis,i,stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean iscyclicUTIL(ArrayList<Edge>[] graph,boolean vis[],int curr,boolean stack[]){
        vis[curr]=true;
        stack[curr]= true;
        //for neighbour
        for(int i =0;i<graph[curr].size();i++){
            //find the neighbour
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){//true condition
                return true;
            }
            if(!vis[e.dest]){
                if(iscyclicUTIL(graph, vis, e.dest, stack)){
                    return true;
                }
            }
        }
        stack[curr]=false;//imp to do backtracking
        return false;
    }
    public static void main(String[] args) {
        int v =4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        boolean ans =iscyclic(graph);
        System.out.println(ans);

    }
}
