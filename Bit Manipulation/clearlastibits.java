package BIT_MANIPULATION;

public class clearlastibits {
    public static void main(String[] args) {
        System.out.println(clearAllbitsafteri(15, 2));
    }
    public static int clearAllbitsafteri(int n,int i){
        //-1 is 11111 then if you do -1<<i then (if i =2) it will become 11000
        int bitMusk = -1<<i;
        return n&bitMusk;
    }
}
//explanation 1==>0001 for 2==>0010 
//last digit is one for odd numbers 
// if you do number&1;
//then you will zero the return "even" else return "odd"
