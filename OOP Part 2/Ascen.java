package OOP_CONTINUED;

public class Ascen {
    public static void main(String[] args) {
        Chicken c = new Chicken();
    }
}
class Animal{
    Animal(){
        System.out.println("parent class constuctor called");
    }
}
class Mustang extends Animal{
    Mustang(){
        System.out.println("Intermediate class constructor called");
    }
}
class Chicken extends Mustang{
    Chicken(){
        System.out.println("Base class constructor is called");
    }
}
