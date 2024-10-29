package HashMap;
import java.util.HashMap;
public class HS6 {
    public static String getStart(HashMap<String,String> tickets){
        //just to find the start
        HashMap<String,String> revHashMap = new HashMap<>();
        //start is to and to is start
        for(String key: tickets.keySet()){
            revHashMap.put(tickets.get(key), key);
        }
        for(String key: tickets.keySet()){
            if(!revHashMap.containsKey(key)){
                return key;//the key is present in hashmap put not present in revhm
            }//that is start
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);//print the start then print the "to" part
        for(String key: tickets.keySet()){
            System.out.print("-->"+tickets.get(start));
            //update the start
            start = tickets.get(start);//start to to then to become start for next iteration
        }
    }
}
