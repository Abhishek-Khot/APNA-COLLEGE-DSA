package HashMap;

import java.util.HashMap;

public class HM1 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        //put
        hm.put("India", 100);
        hm.put("Indonesia", 200);
        hm.put("Japan", 100);
        System.out.println(hm);

        //get
        int population =hm.get("India");//return the value 
        System.out.println(population);

        //remove
        System.out.println(hm.remove("India"));
        System.out.println(hm);
        
        //clear
        hm.clear();
        //containskey
        System.out.println(hm.containsKey("Indonesia"));
        //isEmpty
        System.out.println(hm.isEmpty());
        //size
        System.out.println(hm.size());
    }

}
