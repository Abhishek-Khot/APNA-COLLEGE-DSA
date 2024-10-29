package OOPS_PART_ONE;
public class Types {
    public static void main(String[] args) {
        Student s1 = new Student(3);
        Student s2 = new Student("abhishek");
        Student s3 = new Student(4, "Abhi", 100);
        System.out.println(s3.name);
        System.out.println(s3.marks);
        System.out.println(s1.rollNo);
        System.out.println(s2.name);
    }
}
class Student{
    int rollNo;
    String name;
    int marks;
    Student(){
        System.out.println("constructor is called");
    }
    Student(int rollNo){
        this.rollNo = rollNo;
    }
    Student(String name){
        this.name = name;
    }
    Student(int rollNo,String name,int marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;  
    }
}
