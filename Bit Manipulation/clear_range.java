package BIT_MANIPULATION;

public class clear_range {
    static int clear_range_of_i(int n,int i,int j){
        //(~0) is also called -1
        int a = ((~0)<<j+1);
        int b = (1<<i)-1;//if i is 3 then 0001000
                        //                -0000001
                        //                0000111 is output 
        int bitMusk = a|b;
        return n&bitMusk;
        //
    }
    public static void main(String[] args) {
        System.out.println(clear_range_of_i(10, 2, 4));
    }
}
