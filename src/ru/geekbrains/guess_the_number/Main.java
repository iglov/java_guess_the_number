package ru.geekbrains.guess_the_number;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static void while_guess (int range, int number) {
        while(true) {
            System.out.println("What number is? Type it ...");
            int input_number = scanner.nextInt();

            if (input_number < number) {
                System.out.println("Your number less then my. Try again ;)");
            } else if (input_number > number) {
                System.out.println("Your number grow then my. Try again ;)");
            } else if (input_number == number) {
                System.out.println("Congratulation! You guessed!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to \"Guess the number!\"");

        int range = 15;
        int number = (int)(Math.random() * range);
        System.out.println("I made a number from 1 to " + range + ". Please, guess the number! ^_^");
        while_guess(range, number);
        scanner.close();
    }
}
