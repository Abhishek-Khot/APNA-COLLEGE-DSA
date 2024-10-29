package two_d_array;

import java.util.*;

public class creation {
    public static boolean search(int matrix[][],int key){
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("A key is found at"+"["+i+","+j+"]");
                    return true;
                }
            }
        }
        System.out.println("Key is not found");
        return false;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans;
        int matrix[][]=new int[3][3];
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter key to find");
        int key = sc.nextInt();
        search(matrix, key);
    }
}
