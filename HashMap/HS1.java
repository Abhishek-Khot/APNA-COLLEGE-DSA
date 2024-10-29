package HashMap;

import java.util.HashSet;

public class HS1 {
    public static void main(String[] args) {
        //basic operations
        HashSet<String> hs = new HashSet<>();
        hs.add("Borgaon");
        hs.add("Nepal");
        hs.add("canada");
        System.out.println(hs);

        hs.remove("Borgaon");
        System.out.println(hs);
        if(hs.contains("Borgaon")){
            System.out.println("contain borgaon");
        }
        if(hs.contains("Nepal")){
            System.out.println("contain Nepal");
        }
    }
}
