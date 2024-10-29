package OOPS_PART_ONE;
public class Class{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("yellow");
        System.out.println(p1.color);
        p1.color="green";
        System.out.println(p1.color);
        p1.setSize(5);
        System.out.println(p1.tip);
    }
}
class Pen{
    String color;
    int tip;
    void setColor(String newcolor){
        color=newcolor;
    }
    void setSize(int newtip){
        tip = newtip;
    }
}