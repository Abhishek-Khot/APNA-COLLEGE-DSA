package Tries;

public class Five {
    static class Node{
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;
        public Node(){
            for(int i =0;i<children.length;i++){
                children[i]=null;
            }
            freq = 1;
        }
    }
    public static Node root = new Node();

    //insert
    public static void insert(String words){
        Node curr = root;
        for(int i = 0;i<words.length();i++){
            int idx = words.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            else{
                curr.children[idx].freq++;//usi idx ke freq increase
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static void smallestPrefix(Node root,String ans){
        //base
        if(root == null){
            return;
        }
        if(root.freq == 1){
            System.out.println(ans);
            return;
        }
        for(int i =0;i<root.children.length;i++){
            if(root.children[i]!=null){
                smallestPrefix(root.children[i], ans+(char)(i+'a'));
                //i+'a'==> means if i =0 then a is stored at 0 th location
            }
        }
    }

    public static void main(String[] args) {
        String arr[]={"zebra","dog","dove","duck"};
        for(int i =0;i<arr.length;i++){
            insert(arr[i]);
        }
        root.freq = -1;//bcz the freq of root will be 1==> in the Node class
        smallestPrefix(root, "");
    }
}
