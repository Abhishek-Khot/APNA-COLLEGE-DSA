package OOP_CONTINUED;

public class Supra {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);

    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        //super();//due to super the animal functions are called first-->base constructor - derived constructor (automatically the super is invoked)
        super.color = "brown";
        System.out.println("Horse constructor is called");
    }
}

