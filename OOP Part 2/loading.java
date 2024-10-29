package OOP_CONTINUED;

public class loading {
     public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println(c.sum(4, 5));
        System.out.println(c.sum((float)6.3,(float) 7.3));
        System.out.println(c.sum(5, 0, 0));
     }    
}
class calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
