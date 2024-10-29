package LinkedList2;


public class circularLL {
    static class Node{
        int data;
        Node next;
       
    }
    public static Node addEmpty(int data,Node last){
        if(last != null){
            return last;
        }
        Node newNode = new Node();
        newNode.data = data;
        last = newNode;
        newNode.next = last;
        return last;
    }
    public static Node addFirst(int data,Node last){
        if(last == null){
            return addEmpty(data, last);
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }
    public static void traverse(Node last){
        Node temp;
        if(last == null){
            System.out.println("list is empty");
        }
        temp = last.next;
        do {
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }while (temp != last.next);
        System.out.print("null");
    }

    public static void main(String[] args) {
        circularLL ll = new circularLL();
        Node last = null;
        last = addEmpty(0, last);
        last = addFirst(3,last);
        last = addFirst(2,last);
        last = addFirst(1,last);
        ll.traverse(last);
    }
}
