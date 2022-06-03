package se.lexicon.arrayWeek2;

/**
 * 7. Write a program which will set up an array to hold 10 numbers and print
 * out only the uneven numbers.
 * Expected output: Array: 1 2 4 7 9 12
 * Odd Array: 1 7 9
 */

public class Exercise7 {
    public static void main(String[] args) {
        int[] arrays = {1, 5, 4, 8, 2, 46, 23, 82, 7, 16};
        oddArray(arrays);

    }
        public static void oddArray(int [] numbers) {

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    continue;
                }
                System.out.print(numbers[i] + " ");

            }
        }
}
