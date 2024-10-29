package OOP_CONTINUED;

public class Abstract {
    public static void main(String[] args) {
        // Animal a = new Animal();give the error bcz not able to create obj of abstract class
        Horse pradeep = new Horse();
        pradeep.eat();
        pradeep.walk();

        Chicken basu = new Chicken();
        basu.eat();
        basu.walk();    
    }
}

abstract class Animal{
    void eat(){
        System.out.println("Eats grass");
    }
    abstract void walk();
}
class Horse extends Animal{
    //you should the abract method of animal class 
    void walk(){
        System.out.println("Walks on four legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Walks on two legs");
    }
}
// class Cow extends Animal{//show error bcz not implemented the walk function
//     void eat(){
//         System.out.println("Eat grass");
//     }
// }