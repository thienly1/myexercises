package se.lexicon.arrayWeek2;

/**
 * 6. Write a program which will set up an array to hold the next values in this
 * order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
 * Expected output: Average is: 17.3
 */
public class Exercise6 {
    public static void main(String[] args) {

        int[] numbers = {43, 5, 23, 17, 2, 14};

        double average = 0.0d;
                average= sumary(numbers)/ numbers.length;
        System.out.println(average);
    }
         public static double sumary(int[]arrays) {
             double sum = 0.0d;
             for (int array : arrays) {
                 if (array > 0) {
                     sum = sum + array;
                 }
             }
             return sum;
         }
}
