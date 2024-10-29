package array;

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array :");
        // int size = sc.nextInt();

        int marks[]=new int[100];

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        marks[4]=sc.nextInt();
        System.out.println("physics"+marks[0]);
        System.out.println("physics"+marks[1]);
        System.out.println("physics"+marks[2]);
        System.out.println("physics"+marks[3]);
        System.out.println("physics"+marks[4]);


        marks[0]=78;
        System.out.println(marks[0]);
        marks[0]=marks[0]+3;
        System.out.println(marks[0]);

        int percentage = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("percentage is "+percentage);

    }
}
