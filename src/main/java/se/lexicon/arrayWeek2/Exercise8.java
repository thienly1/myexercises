package se.lexicon.arrayWeek2;

import java.util.Arrays;

/**
 * 8. Write a program which will remove the duplicate elements of a given
 * array [20, 20, 40, 20, 30, 40, 50, 60, 50].
 * Expected output: Array: 20 20 40 20 30 40 50 60 50
 *  Array without duplicate values: 20 40 30 50 60
 */
public class Exercise8 {
    public static void main(String[] args) {
        int[] array = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        withoutDuplicate(array);
        System.out.println(Arrays.toString(withoutDuplicate(array)));
        int[] anh = endResult(withoutDuplicate(array));
        for (int an = 0; an< anh.length; an++) {
            if (anh[an] !=0) {
                System.out.print(anh[an] + " ");
            }
        }

    }

    public static int[] withoutDuplicate(int[] arrays) {

        int i = 0;
        int[] news = new int[0];

        for (int k = 0; k < arrays.length - 1; k++) {
            i = k;
            int j;
            for (j = k + 1; j < arrays.length; j++) {
                if (arrays[k] == arrays[j]) {
                    continue;
                }
                arrays[i + 1] = arrays[j];
                i++;
            }
            news = Arrays.copyOf(arrays, arrays.length);
        }
        return news;
    }

    public static int[] endResult(int[] endArrays) {

        for (int i = 0; i < endArrays.length; i++) {
            for (int j = i + 1; j < endArrays.length; j++) {
                if (endArrays[i] == endArrays[j]) {
                    endArrays[j] = 0;
                }
            }

        }
        return endArrays;
    }
}





