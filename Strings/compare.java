package Strings;

import java.util.*;

public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String FullName = sc.nextLine();
        if(name.equals(FullName)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }

    }
}
