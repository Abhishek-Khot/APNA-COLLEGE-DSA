package OOP_CONTINUED;

public class Overriding {
    public static void main(String[] args) {
       Deer d1 = new Deer();
       d1.eat(); 
    }
}
class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.err.println("eat grass");
    }
}
