package two_d_array;

import java.util.*;;

public class largestand {
    public static int searchlargest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(largest<matrix[i][j]){
                    largest=matrix[i][j];
                }
            }
        }
        return largest;

    }
    public static int searchsmallest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(smallest>matrix[i][j]){
                    smallest=matrix[i][j];
                }
            }
        }
        return smallest;

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
        ans = searchlargest(matrix);
        System.out.println("Largest number is "+ans);
        int noob = searchsmallest(matrix);
        System.out.println("Smallest element is "+noob);
    }
}
