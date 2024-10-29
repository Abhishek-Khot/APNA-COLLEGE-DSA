package OOPS_PART_ONE;

public class Deep {
   public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Abhishek khot";
    s1.password = 12345;
    s1.marks[0]=90;
    s1.marks[1]=100;
    s1.marks[2]=80;
    //copy constructor
    Student s2 = new Student();
    s1.marks[0]=85;//after calling copy constructor we done the change but it will reflect -->solution deep copy constructor 
    //as it is array the change are done heap which are permanent 
    System.out.println(s2.marks[0]);


   } 
}
class Student{
    String name;
    int password;
    int marks[]= new int[3];
    Student(){
        System.out.println("Constructor is called ");
    }
    //shallow copy constuctor
    // Student(Student s1){
    //     this.name = s1.name;
    //     this.password = s1.password;
    //     this.marks=s1.marks;
    // }
    //solution to not reflect the changes
    //deep copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.password = s1.password;
        for(int i =0;i<marks.length;i++){
            this.marks[i]= s1.marks[i];
        }
        
    }
}