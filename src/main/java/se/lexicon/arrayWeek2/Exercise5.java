package se.lexicon.arrayWeek2;

import java.util.Arrays;

/**
  5. Create a two-dimensional string array [2][2]. Assign values to the 2d
    array containing any Country and City.
    Expected output: France Paris
    Sweden Stockholm
 */
public class Exercise5 {
    public static void main(String[] args) {

        String[][] names = new String[2][2];

        names[0][0] = "France";
        names[0][1] = "Paris";
        names[1][0] = "Sweden";
        names[1][1] = "Stockholm";

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                    System.out.print(names[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
