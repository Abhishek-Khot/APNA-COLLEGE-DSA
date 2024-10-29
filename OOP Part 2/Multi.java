package OOP_CONTINUED;

public class Multi {
    public static void main(String[] args) {
        Dog rot = new Dog();
        rot.eat();
        rot.milk();
        rot.legs = 4;
        System.out.println(rot.legs);
    }
}
class Animal{
    String color;
    int legs;
    void eat(){
        System.out.println("Eats");
    }
    void jump(){
        System.out.println("jumps");
    }
}
class Mammal extends Animal{
    int milk;
    void milk(){
        System.out.println("Drink milk");
    }
}
class Dog extends Mammal{
    void bark(){
        System.out.println("Yes barks");
    }
}
