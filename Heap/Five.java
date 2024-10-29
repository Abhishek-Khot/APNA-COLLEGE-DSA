package Heap;

import java.util.*;//min heap
//this code tell how the heap is implemented --> but we can implement the heap directly

public class Five {
    static class Heap {

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            // heap fixing
            int x = arr.size() - 1;
            int parent = (x - 1) / 2;
            while (arr.get(x) < arr.get(parent)) {// parent should small
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);
                //in while loop we should update the thing
                x=parent;
                parent= (x-1)/2;
            }

        }

        public int peek() {
           return arr.get(0);
        }
f
        // delete from the heap
        public int delete() {

            // we delete the root means the first element of arraylist
            int data = arr.get(0);
            // 1] swap the first and last index
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // 2] delete the element
            arr.remove(arr.size() - 1);// the values are replace so delete
            // the last element which is first element at initial

            // 3]heapify
            heapify(0);// our root is index 0
            return data;

        }

        // heapify function
        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            // comparison and taking the minimum
            int minIdx = i;
            // following line is explained in notes
            // here the index com    //here the values are compared
            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if (right< arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }
            // min is equal to i then no need to swap
            if (minIdx != i) {
                // swap
                int temp = arr.get(i);// i means root and minidx is the node to swap
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                heapify(minIdx);// recursive call to fix all element
                // minidx var change zala next elements should be fixed
            }
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }

        public static void main(String[] args) {
            Heap pq = new Heap();
            pq.add(5);
            pq.add(9);
            pq.add(8);
            pq.add(4);
            pq.add(6);
            while (!pq.isEmpty()) {
                System.out.println(pq.peek());
                pq.delete();
            }
        }
    }
}
