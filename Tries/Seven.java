package Tries;

//for apple =15 and ababa = 10
public class Seven {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;// type node means address
            }
        }
    }

    public static Node root = new Node();

    // insert function
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';// going onto each letter of word and finding the index
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        } // out of loop means last letter of word
        curr.eow = true;
    }
    //countNodes -->starts with root 
    public static int countNodes(Node root){
        if(root == null ){
            return 0;
        }
        int count =0;
        for(int i =0;i<26;i++){
            count+=countNodes(root.children[i]);//+1
        }
        return count+1;

    }
    public static void main(String[] args) {
        String str = "aba";
        for(int i =0;i<str.length();i++){
            //find the substring
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countNodes(root));
    }

}
