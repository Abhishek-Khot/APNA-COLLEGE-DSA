package HashMap;

import java.util.*;
public class HM2 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("china", 50);
        hm.put("US", 60);
        Set<String> key = hm.keySet();
        for(String str :key){
            System.out.println(str);
        }
    }
}