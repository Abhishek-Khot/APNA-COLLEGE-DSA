package Greedy;
import java.util.ArrayList;
import java.util.Collections;

public class GA7 {
    static class Job{
        int id;
        int deadline;
        int profit;
        public Job(int i,int d,int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][] = {{1,40},{1,30},{4,20},{1,10}};
        ArrayList<Job> jobs = new ArrayList<>();

        for(int i =0;i<jobInfo.length;i++){
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }
        //define then sort
        //how to sort the objects
        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);

        int time=0;
        ArrayList<Integer> seq = new ArrayList<>();
        for(int i =0;i<jobs.size();i++){
            Job curr = jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("Maximum jobs can be done "+ seq.size());
        for(int i =0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
    }
}