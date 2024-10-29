package HashMap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.*;


public class Assigntop {
    class Node{
        int data;
        Node left ;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
    }
    static class Pair{
    int coloumn_level;
    Node node;
    Pair(Node node,int coloumn_level)
    {
        this.coloumn_level = coloumn_level;
        this.node= node;
    }
}

class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> ans= new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        Map<Integer, Integer > map = new TreeMap<>(); // (vertical coloumn , node_data)
        Queue<Pair> q = new LinkedList<Pair>(); // pair( node, vertical coloumn)
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair it = q.remove();
            int coloumn_level = it.coloumn_level;
            Node node = it.node;
            if(map.get(coloumn_level)==null)
            {
                map.put(coloumn_level, node.data);
            }
            else{
                ;
            }
            if(node.left!=null)
            {
                q.add(new Pair(node.left,coloumn_level-1));
            }
            if(node.right!=null)
            {
                q.add(new Pair(node.right,coloumn_level+1));
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            ans.add(entry.getValue());
        }
        return ans;
    }
}
}
