package BIT_MANIPULATION;

public class googlecountofsetbits {
    static int countOfsetBits(int n){
        int count =0;
        while (n>0) {
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("number of 1 or setbits are "+ countOfsetBits(10));
    }
}
