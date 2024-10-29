package Strings;

import java.util.*;

public class fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] fruit = { "mango", "jackfruit", "apple" };
        String largest = fruit[0];
        for (int i = 1; i < fruit.length; i++) {
            if (largest.compareToIgnoreCase(fruit[i]) < 0) {
                largest = fruit[i];
            }
            System.out.println(largest);
        }

    }
}
