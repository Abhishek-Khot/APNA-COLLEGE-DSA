package OOP_CONTINUED;

public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "JVM";
        Student s2 = new Student();
        Student s3 = new Student();
        s3.schoolName = "ABC";
        System.out.println(s2.schoolName);//before it is JVM after line 10 change to ABC because the changes are done in heap
        System.out.println(s3.schoolName); 
    }
}
class Student{
    String name;
    int rollNo;
    static String schoolName;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

}
