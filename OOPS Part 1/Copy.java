package OOPS_PART_ONE;

public class Copy {
   public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Abhishek khot";
    s1.password = 12345;
    //copy constructor
    Student s2 = new Student();

   } 
}
class Student{
    String name;
    int password;
    Student(){
        System.out.println("Constructor is called ");
    }
    //copy constuctor
    Student(Student s1){
        this.name = s1.name;
        this.password = s1.password;
    }
}