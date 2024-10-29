package Tries;



public class three {
    static class Node{
        Node children[]= new Node[26];
        boolean eow = false;
        Node(){
            for(int i =0;i<children.length;i++){
                children[i]=null;
            }
        }
    }
    public static Node root = new Node();

    //inserting the node
    public static void insert(String word){
        Node curr = root;
        for(int level =0;level<word.length();level++){
            int idx = word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();//curr node contain a AL of childrens

            }
            curr = curr.children[idx];
        }
        //we are out of the for loop so we are at last node (last node means curr node only)
        curr.eow = true;
    }
    //search
    public static boolean search(String key){
        Node curr = root;
        for(int level =0;level<key.length();level++){
            //here we are going one by one on key string
            int idx = key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;//that letter doesnot exist
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }
    public static void main(String[] args) {
        String word[]={"the","a","there","their","any","thee"};
        for(int i =0;i<word.length;i++){
            insert(word[i]);
        }
        System.out.println(search("thee"));//true
        System.out.println(search("th"));//false
        System.out.println(search("any"));//true

    }
}

