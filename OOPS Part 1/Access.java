package OOPS_PART_ONE;



public class Access {
    public static void main(String[] args) {
    Bank b1 = new Bank();
    b1.username="abhishek";
    b1.setPassword("hello");
    // System.out.println(b1.password);
    }

}
class Bank{
    public String username;
    private String password ;
    void setPassword(String psw){
        password = psw;
    }
}
