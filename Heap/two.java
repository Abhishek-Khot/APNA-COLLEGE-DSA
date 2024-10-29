package Heap;

import java.util.*;
public class two {
    static class Student implements Comparable<Student> {
        String name;
        int rank;
        Student(String name ,int rank) {
            this.name = name;
            this.rank = rank;
        }
        //function overriding
        //min heap
        @Override
        public int compareTo(Student s2){
            return this.rank -s2.rank;//implement the min heap
        }
        
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("ABHISHEK", 3));
        pq.add(new Student("SANIKA", 1));
        pq.add(new Student("SUMEET", 4));
        pq.add(new Student("ARPITA", 2));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name);
            pq.remove();
            
        }
        
    }
}