package OOP_CONTINUED;

public class Aconst {
    public static void main(String[] args) {
        // Animal a = new Animal();give the error bcz not able to create obj of abstract class
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        Chicken c = new Chicken();
        //until you change the color it is brown only
        c.setColor();
    }
}

abstract class Animal{
    String color;
    Animal(){
        color = "brown";//by default color is brown for all derived color
        //if you call horse.color -->return the brown color
    }
    void eat(){
        System.out.println("Eats grass");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("Walks on four legs");
    }
}
class Chicken extends Animal{
    //until you change the color it is brown only
    void setColor(){
        color = "black";
        System.out.println(color);
    }
    void walk(){
        System.out.println("Walks on two legs");
    }
}
