
package recursion2;
public class sir {
    public static int pow(int x, int y){

        int smallerAns = pow(x,y-1);
        int ans = x * smallerAns;

        return ans;
    }

    public static int friendPairing(int n){
        if(n<=2){
            return n;
        }

        int single = friendPairing(n-1);
        int pairUp = (n-1) * friendPairing(n-2);

        int totalWays = single + pairUp;

        return totalWays;
    }

    public static void toh(int n, int A, int C, int B){ // move n disks from A to C using B
        if(n==0){
            return;
        }

        toh(n-1,A,B,C);

        System.out.println("Moving " + n + "th disk from " + A + "to" + C);

        toh(n-1,B,C,A);
    }

    public static void main(String[] args) {
        // toh(3,1,3,2);
        System.out.println(friendPairing(4));
    }
}