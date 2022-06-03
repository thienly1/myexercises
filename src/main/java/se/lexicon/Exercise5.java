package se.lexicon;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner exer5 = new Scanner(System.in);

        String name;
        System.out.println(" pls enter your name : ");
        name = exer5.nextLine();
        System.out.println("Hello " + name);
    }
}
