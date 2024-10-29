package HashMap;

import java.util.HashMap;

import java.util.LinkedHashMap;

import java.util.TreeMap;

public class HM4 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("china", 50);
        hm.put("US", 60);
        System.out.println("HashMap "+ hm);
        // System.out.print(hm);

        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("china", 50);
        lhm.put("US", 60);
        System.out.println("Linked Hashmap "+lhm);
        // System.out.println(lhm);

        TreeMap<String,Integer>tree = new TreeMap<>();
        tree.put("India", 100);
        tree.put("China", 50);
        tree.put("US", 60);
        System.out.println("Tree Map "+tree);
    }
}
