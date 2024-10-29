package OOP_CONTINUED;

public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
//interfaces are used to achieve total abstraction
interface chessPlayer{
    void moves();//by default it is abstract 
}
class Queen implements chessPlayer{
    public void moves(){
        System.out.println("go in the any directions");
    }
}
class Rook implements chessPlayer{
    public void moves(){
        System.out.println("go in up down direction");
    }
}
class Pawn implements chessPlayer{
    public void moves(){
        System.out.println("go one step in one direction");
    }
}
