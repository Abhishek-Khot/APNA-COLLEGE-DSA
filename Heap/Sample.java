package Heap;
import java.util.PriorityQueue;
public class Sample {
    public static void main(String[] args) {
        PriorityQueue<String>  pq = new PriorityQueue<>();
        pq.add("abhishek");
        pq.add("Abhishek");
        pq.add("Khot");
        pq.add("Raju");
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
            
        }

    }
}
