package Backtracking;

public class subsetuseifelse {
    public static void findSubsets(String str,String ans,int i){
        //base
        if(i==str.length()){
            // if(str.length()==0){
            //wrong bcz we are storing ans in ans string
            if(ans.length()==0){
                System.out.println("NULL");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        //for yes
        findSubsets(str, ans+str.charAt(i), i+1);
        //for no
        findSubsets(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, " ", 0);
    }
}
