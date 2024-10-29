package recursion2;

public class removeduplicate {
    public static void remove(String str,int idx,StringBuilder newstr,boolean map[]){
        //base case
        if(idx ==str.length()){
            System.out.println(newstr);
            return;
        }
        //current character index
        char currChar = str.charAt(idx);
        //if boolean[]==true then  next index 
        //location of current char is currchar -'a ' index of other char u will ger
        if(map[currChar-'a']==true){
            remove(str, idx+1, newstr, map);
        }
        else{
            // otherwise store the true and append the current character
            map[currChar-'a']=true;
            remove(str, idx+1, newstr.append(currChar), map);
        }


    }



    public static void main(String[] args) {
        String str = "aabbhhii";
        remove(str,0,new StringBuilder("") ,new boolean[26]);
        //StringBuilder newstr = new StringBuilder(" ");
        //boolean map[] =new boolean[26];
        //directly written
    
    
    }

}
