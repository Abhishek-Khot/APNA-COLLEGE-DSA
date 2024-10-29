//implementing the priority queue
package Heap;
import java.util.PriorityQueue;
import java.util.Comparator;
public class one {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        System.out.println("Output for first queue in normal way");
        pq.add(3);
        pq.add(4);
        pq.add(7);
        pq.add(8);
        while (!pq.isEmpty()) {
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
        System.out.println();
        System.out.println("Output for second queue in reverse order");
        pq2.add(5);
        pq2.add(6);
        pq2.add(9);
        pq2.add(3);
        while (!pq2.isEmpty()) {
            System.out.print(pq2.peek()+" ");
            pq2.remove();
        }
    }
}
