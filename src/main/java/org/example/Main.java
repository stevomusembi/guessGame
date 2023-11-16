package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int trials = 0;
        Random random = new Random();
        int randomNumber = random.nextInt(11);
        Scanner scanner = new Scanner(System.in);
        while (trials < 5) {
            System.out.print("Guess a number between 0 and 10 ");
            try {
                int usersGuess = scanner.nextInt();
                System.out.println("your guess is " + usersGuess);
                if(usersGuess == randomNumber){
                    System.out.println("You are right :) ");
                    System.out.println("Answer is " + randomNumber);
                    return;
                } else {
                    System.out.println("You are wrong :(");
                }
                trials ++;
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid number");
                scanner.nextLine();

            }

        }
        System.out.println("Enough tries, the answer is " + randomNumber);
        scanner.close();

    }

}