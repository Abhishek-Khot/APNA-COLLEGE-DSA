package recursion2;

public class tile {
     public static int totalways(int n){
        if(n==0||n==1){
            return 1;
        }
        int fnm1 = totalways(n-1);
        int fnm2 = totalways(n-2);
        int total = fnm1+fnm2;
        return total;
     }

    public static void main(String[] args) {
        System.out.println(totalways(4));
    }
}
