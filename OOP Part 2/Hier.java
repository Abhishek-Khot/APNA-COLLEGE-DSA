package OOP_CONTINUED;

// one base multiple child

public class Hier {
    public static void main(String[] args) {
        Mammal m = new Mammal();
        Fish f = new Fish();
        Dog d = new Dog();
        m.eat();
        f.eat();
        d.eat();
        d.legs = 3;
        System.out.println(d.legs);

    }
}
class Animal{
    int legs;
    void eat(){
        System.out.println("eats");
    }
}
class Mammal extends Animal{
    void milk(){
        System.out.println("produce milk");
    }
}
class Fish extends Animal{
    void swims(){
        System.out.println("swims");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barks");
    }
}
