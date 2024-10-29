package BIT_MANIPULATION;
public class ithelt {
    public static int ithelement(int n,int i){
        int bitMusk =1<<i;
        if((n&bitMusk)==0){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        int ans1=ithelement(10, 2);
        int ans2=ithelement(10, 3);
        System.out.println(ans1+" "+ans2);
    }
}
