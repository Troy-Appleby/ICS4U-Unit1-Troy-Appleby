/*
 * This is a program is the dice game
 *
 * author  Troy Appleby
 * version 1.0
 * since   2024-02-27
 */

import java.util.Random;
import java.util.Scanner;

/**
* This is the standard "DiceGame" program.
*/
final class DiceGame {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private DiceGame() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // constants & variables
        final Scanner scanner = new Scanner(System.in);
        final Random random = new Random();
        final int randomNumber = random.nextInt(6) + 1;
        final int randomNumberMax = 6;
        final String invalidInputString =
            "Invalid input";
        int totalGuesses = 0;
        int userGuessInt = 0;

        while (true) {
            // input and error check
            boolean validInput = false;
            try {
                System.out.print("Guess a number between 1 - 6: ");
                final String userGuessString = scanner.nextLine().trim();
                if (userGuessString.isEmpty()) {
                    System.out.println(invalidInputString);
                } else {
                    userGuessInt = Integer.parseInt(userGuessString);
                    if (userGuessInt < 1 || userGuessInt > randomNumberMax) {
                        System.out.println(invalidInputString);
                    } else {
                        validInput = true;
                    }
                }
            } catch (NumberFormatException ex) {
                System.out.println(invalidInputString);
            }
            // process
            if (validInput) {
                totalGuesses += 1;
                if (userGuessInt > randomNumber) {
                    System.out.println("You guessed too high, try again!\n");
                } else if (userGuessInt < randomNumber) {
                    System.out.println("You guessed too low, try again!\n");
                } else {
                    // output
                    System.out.println(
                        "You are correct!\nTotal guesses: " + totalGuesses
                    );
                    break;
                }
            }
        }
        System.out.println("\nDone.");
    }
}
