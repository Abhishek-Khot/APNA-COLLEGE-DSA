package Tries;
public class one {
    //creating a node 
    static class Node{
        Node [] children = new Node[26];//the letter usually used are small letters
        boolean eow = false;//intialized with false --> if the true is stored then other should be false
        //constructor doesnot contain anything bcz many childrens can be stored in array and tracked with array
        Node(){
            //initial all the arr values with null-->bcz we are creating the trie 
            for(int i =0;i<26;i++){
                children[i]=null;//type is node so address of nodes
            }
        }
    }
    //why we make node as static class  --> due to following line-->conclusion is that we can create the root outside the Node class
    public static Node root=new Node();//root is empty always

    public static void main(String[] args) {
        String words[]={"the","a","there","their","any","thee"};

}
}