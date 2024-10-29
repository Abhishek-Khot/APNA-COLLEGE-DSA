package Tries;

public class Six {
    static class Node{
        Node[] children = new Node[26];
        boolean eow = false;
        public Node(){
            for(int i =0;i<children.length;i++){
                children[i]=null;//storing the addresses
            }
        }
    }
    public static Node root = new Node();
    //insert operation
    public static void Insert(String words){
        Node curr = root;
        for(int level =0 ;level<words.length();level++){
            //this is the index of single word of given word

            int idx = words.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]= new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    //search function
    public static boolean search(String key){
        Node curr = root;
        for(int level =0 ;level<key.length();level++){
            //this is the index of single word of given word
            int idx = key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;

    }
    //startWith function-->here no need to check for eow
    public static boolean startsWith(String key){
        Node curr = root;
        for(int level =0 ;level<key.length();level++){
            int idx = key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String words[]={"apple","app","mango","man","woman"};
        String prefix1 ="app";//true
        String prefix2 = "man";//true
        String prefix3= "moon";//false
        String prefix4 = "woma";//true
        String prefix5 = "mang";//true
        for(int i =0;i<words.length;i++){
            Insert(words[i]);
        }
        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));
        System.out.println(startsWith(prefix3));
        System.out.println(startsWith(prefix4));
        System.out.println(startsWith(prefix5));

    }
}
