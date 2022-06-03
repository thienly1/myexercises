package se.lexicon;

import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        Random ran = new Random();
        int randomNumber = 1 + ran.nextInt(500);

        Scanner exer8 = new Scanner(System.in);
        while (true) {
            System.out.println("Pls enter your guess! (1-500)");
            int guessNumber = exer8.nextInt();

            if (guessNumber == randomNumber) {
                System.out.println("That's correct! the random number is " + randomNumber);
                break;
            } else if (guessNumber < randomNumber) {
                System.out.println("Your guess was too small. Pls guess again!");
            } else {
                System.out.println("Your guess was too big. Pls guess again");
            }
        }


    }
}