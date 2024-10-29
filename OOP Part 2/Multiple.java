package OOP_CONTINUED;

public class Multiple {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat();
        b.eats();
    }
}
interface Herbivore{
    void eat();
}
interface Carnivore{
    void eats();
}

class Bear implements Herbivore,Carnivore{
    public void eat(){
        System.out.println("eat both grass ");
    }
    public void eats(){
        System.out.println("eat meat also");
    }
}
