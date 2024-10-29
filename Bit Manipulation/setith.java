package BIT_MANIPULATION;

public class setith {
    public static int setIthBit(int n,int i){
        int bitMusk = 1<<i;
        return n|bitMusk;
    }
    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }
}
