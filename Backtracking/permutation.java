package Backtracking;

public class permutation {
    public static void findPermutation(String str,String ans){
        //base
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursive
        for(int i=0;i<str.length();i++)
        {
            char curr = str.charAt(i);
            //remove the char for next combination
            //remove i th character
            String newStr = str.substring(0, i)+str.substring(i+1);
            findPermutation(newStr, ans+curr);

        }
    }
    public static void main(String[] args) {
        String str ="abc";
        findPermutation(str, " ");

    }
}
