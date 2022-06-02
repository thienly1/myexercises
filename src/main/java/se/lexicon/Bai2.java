package se.lexicon;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner bai2 = new Scanner(System.in);

        System.out.println("enter the year: ");
        int year = bai2.nextInt();

        int leap = year % 400;
        int leap1 = year % 4;
        int leap2 = year % 100;

        if((leap ==0)|| ((leap1 ==0) && (leap2!=0))) {
            System.out.println(year + " is leap year ");
        } else {
            System.out.println(year + " is not leap year");
        }
    }


}
