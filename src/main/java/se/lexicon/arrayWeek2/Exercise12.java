package se.lexicon.arrayWeek2;

/**
 * 12.Write a program which will print the diagonal elements of two-dimensional array.
 *   1  2  3
 *   2  4  6
 *   3  6  9
 * Expected output: 1 4 9
 */

public class Exercise12 {
    public static void main(String[] args) {
        int [][] arrays = new int[3][3];
        arrays[0][0] = 1;
        arrays[0][1] = 2;
        arrays[0][2] = 3;

        arrays[1][0] = 2;
        arrays[1][1] = 4;
        arrays[1][2] = 6;

        arrays[2][0] = 3;
        arrays[2][1] = 6;
        arrays[2][2] = 9;
         for (int i = 0; i< arrays.length; i++){
             for (int j = 0; j< arrays[i].length; j++){
                 if ( i == j){
                     System.out.print(arrays[i][j]+" ");
                 }
             }
         }

    }

}
