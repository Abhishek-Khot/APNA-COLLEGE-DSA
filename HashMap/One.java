package HashMap;

import java.util.HashMap;

public class One {
   public static void main(String[] args) {
    //creating the hashmap
    HashMap<String,Integer> hm = new HashMap<>();
    
    //put operation
    hm.put("India",120);
    hm.put("China",130);
    hm.put("Indo", 70);
    System.out.println(hm);//Not follow any order

    //get operation
    int population = hm.get("India");//return 120
    System.out.println(population);
    // int population2 = hm.get("soudi");//key does not exist so return null
    // System.out.println(population2);

    //containKey return true or false based on contain a key or not
    System.out.println(hm.containsKey("India"));
    System.out.println(hm.containsKey("soudi"));

    //remove key  
    System.out.println(hm.remove("India"));//print the value
    System.out.println(hm);

    //size of HashMap
    System.out.println("size of the HashMap "+ hm.size());

    //is empty condition
    if(hm.isEmpty()){
        System.out.println("hm is empty");
    }
    else{
        System.out.println("Not empty");
    }

   } 
}
