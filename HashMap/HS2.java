package HashMap;

import java.util.*;
public class HS2 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Borgaon");
        hs.add("Nepal");
        hs.add("canada");

        //normal iteration method
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //advanced way to iterate
    }
}
