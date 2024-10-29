package array;

public class mix {
    public static void main(String[] args) {
        int number[]={10,20,30,40 };
        int no_nochange =5;
        update_array(number,no_nochange);
        for(int i =0;i<number.length;i++){
            System.out.println(number[i]);
        }
        System.out.println("call by value no change "+no_nochange);
        
    }
    public static void update_array(int number[],int no_nochange){
        no_nochange=10;
        for(int i =0;i<number.length;i++){
            number[i]=number[i]+1;
        }
    }
}
