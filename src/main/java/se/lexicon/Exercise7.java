package se.lexicon;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        Scanner exer7 = new Scanner(System.in);

        int seconds;
        System.out.println(" pls enter seconds : ");
        seconds = exer7.nextInt();
        int a = seconds % 3600;
        int b = seconds / 3600;
        int c = a % 60;
        int d = a / 60;
        String hour = b + ":" + d + ":" +c;

        System.out.println(seconds + " seconds = " + hour);

    }
}
