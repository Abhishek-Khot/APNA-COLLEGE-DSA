package Greedy;

public class Balaced {
    public static void main(String[] args) {
      String str = "LRRRRLLRLLRL";
      System.out.println(count(str));
    }
    public static int count(String str){
        int lcount =0;
        int rcount =0;
        int ans =0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='L'){
                lcount++;
            }
            else{
                rcount++;
            }
            if(lcount==rcount){
                ans++;
            }
        }
        return ans;
    }
}
