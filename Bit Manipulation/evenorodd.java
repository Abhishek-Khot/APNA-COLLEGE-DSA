package BIT_MANIPULATION;

public class evenorodd {
    public static boolean checkEvenOrOdd(int n) {
        int bitMusk = 1;
        if ((n & bitMusk) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (checkEvenOrOdd(i)) {
                System.out.println(i + " is a even number");
            } else {
                System.out.println(i + " is a odd number");
            }
        }

    }
}
