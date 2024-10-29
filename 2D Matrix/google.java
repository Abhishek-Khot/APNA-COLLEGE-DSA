package two_d_array;

import array.pair;

public class google {
    public static void printspiral(int matrix[][]){
        int startrow= 0;
        int endrow =matrix.length-1;
        int startcol =0;
        int endcol =matrix[0].length-1;
        while (startrow<=endrow&&startcol<=endcol) {
            // top
            for(int i =startrow;i<=endrow;i++){
                System.out.println(matrix[i]+" "+endcol);
            }
        }
        
    }
    public static void main(String[] args) {
        int matrix[][]={ {1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
                         printspiral(matrix);
    }
}
