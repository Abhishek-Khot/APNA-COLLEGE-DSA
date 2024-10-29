package BIT_MANIPULATION;

public class clearith {
    public static void main(String[] args) {
        System.out.println(clearithbit(10, 1));
    }
    public static int clearithbit(int n,int i){
        //as the 1<<i will give the ith bit if we do ~of that then 1<<i become the zero and zero AND anything is zero
        //int bitmusk = ~(1<<i);
        //return n&bitmusk;
        return n&(~(1<<i));
    }
}
