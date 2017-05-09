package ru.geekbrains.guess_the_number;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to \"Guess the number!\"");
        for (int range = 10; range <= 30; range += 10) while_guess(range);
        System.out.println("Game over! You win!");
        scanner.close();
    }

    private static Scanner scanner = new Scanner(System.in);

    private static void while_guess (int range) {
        int number = (int)(Math.random() * range);
        System.out.println("I made a number between 0 and " + range + ". Please, guess the number! ^_^");

        while(true) {
            System.out.println("What number is? Type it ...");
            int input_number = scanner.nextInt();

            if (input_number < number) {
                System.out.println("Your number less then my. Try again ;)");
            } else if (input_number > number) {
                System.out.println("Your number grow then my. Try again ;)");
            } else if (input_number == number) {
                System.out.println("Congratulation! Level complete!");
                break;
            }
        }
    }
}
