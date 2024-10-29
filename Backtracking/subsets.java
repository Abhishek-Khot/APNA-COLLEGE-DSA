package Backtracking;

public class subsets {
    public static void findSubsets(String str,String ans,int i){
        //base
        if(i==str.length()){
            System.out.println(ans);
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
