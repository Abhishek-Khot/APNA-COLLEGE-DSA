package HashMap;
import java.util.*;
public class HS3 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Borgaon");
        hs.add("Nepal");
        hs.add("canada");
        System.out.println(hs);


        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Nepal");
        lhs.add("Borgaon");
        lhs.add("canada");
        System.out.println(lhs);


        TreeSet<String> ts = new TreeSet<>();
        ts.add("Borgaon");
        ts.add("Nepal");
        ts.add("canada");
        System.out.println(ts);


    }
}
