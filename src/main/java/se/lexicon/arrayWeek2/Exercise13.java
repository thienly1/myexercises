package se.lexicon.arrayWeek2;

/**
 * 13. Create two arrays with arbitrary size and fill one with random numbers.
 * Then copy over the numbers from the array with random numbers so
 * that the even numbers are located in the rear (the right side) part of
 * the array and the odd numbers are located in the front part (the left side)
 */

public class Exercise13 {
    public static void main(String[] args) {

        int [] numbers = {2, 5, 7, 13, 25,  28, 4,12, 60,53, 41, 34};
        int [] arrays = new int [numbers.length];
        int index = 0;
        for ( int i = 0; i< numbers.length; i++){
            if ( numbers[i] % 2 == 0) {
                arrays[index]=  numbers[i];
                index ++;
            }
            }
        for ( int i =0; i< numbers.length; i++){
            if (numbers[i] % 2 != 0){
                arrays[index]= numbers[i];
                index++;
            }
        }
        for ( int array : arrays){
            System.out.print(array + " ");
        }
    }

}
