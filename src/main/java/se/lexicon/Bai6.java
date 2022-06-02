package se.lexicon;

import java.util.Scanner;

public class Bai6 {

    public static void main(String[] args) {
        Scanner bai6 = new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("pls enter first number: ");
        number1 = bai6.nextInt();
        System.out.println(" pls enter second number: ");
        number2 = bai6.nextInt();
        int sum = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        double division = number1 / number2;
        System.out.println("Sum of two numbers is : " + sum);
        System.out.println("Subtraction of two numbers is : " + subtraction);
        System.out.println("Multiplication of two numbers is : " + multiplication);
        System.out.println("Division of two numbers is : " + division);
    }
}
