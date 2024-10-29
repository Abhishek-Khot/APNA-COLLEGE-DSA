package recursion2;
public class friend {
    public static int friendPair(int n){
        if(n<=2){
            return n;
        }
        return friendPair(n-1)+(n-1)*friendPair(n-2);
    }

    public static void main(String[] args){

       System.out.println(friendPair(3));


    }
}
