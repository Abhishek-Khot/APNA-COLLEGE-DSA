package OOP_CONTINUED;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();//constructor is created automatically
        shark.eat();

    }
}
class Animal{
    int color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathe ");
    }
}
class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("swims");
    }
}
