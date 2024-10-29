package OOPS_PART_ONE;

public class Constructor {
    public static void main(String[] args) {
        Student s1  = new Student(12,"Abhishek");
        System.out.println("name and roll number are "+s1.name+" " +s1.data);
    }
}
class Student {
    int data;
    String name;
    Student(int data,String name){
        this.data = data;
        this.name = name;
    } 
}
