package recursion;

import java.lang.Math;

import java.util.*;

public class all {
    public static int fiOccurance(int array[], int key, int i) {
        if (i == array.length) {
            return -1;
        }
        if (array[i] == key) {
            return i;
        }
        return fiOccurance(array, key, i + 1);
        //call stack goes on increase and then come downwords means array[0]to array.length

    }

    public static int lastOccurance(int array[], int key, int i) {
        if (i == array.length) {
            return -1;
        }
        int found = lastOccurance(array, key, i + 1);
        if (found == -1 && array[i] == key) {
            return i;
        }
        return found;
        //here the goes on increase along with ans 
        //so array.lenght to array[0]
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = optimizedPower(x, n / 2);
        int halfpowersq = (int) Math.pow(halfpower, 2);// or halfpower*halfpower

        // int halfpowersq=optimizedPower(x, n/2)*optimizedPower(x, n/2);//time is max
        if (n % 2 != 0) {
            halfpowersq = x * halfpowersq;
        }
        return halfpowersq;

    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 5, 6, 43, 23, 5 };
        System.out.print(fiOccurance(array, 43, 0) + " ");
        System.out.print(lastOccurance(array, 5, 0) + " ");
        System.out.print(power(2, 4) + " ");
        System.out.print(optimizedPower(2, 5));
    }
}
