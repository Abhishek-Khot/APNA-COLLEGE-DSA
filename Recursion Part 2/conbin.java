
package recursion2;
public class conbin {
    public static void printBinaryString(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        if(lastplace ==0){
            printBinaryString(n-1, 0, str+"0");
            printBinaryString(n-1, 1, str+"1");
        }
        else{
            printBinaryString(n-1,0, str+"0");

        }

    }
    public static void main(String[] args) {
        printBinaryString(3, 0, " ");
    }
}
