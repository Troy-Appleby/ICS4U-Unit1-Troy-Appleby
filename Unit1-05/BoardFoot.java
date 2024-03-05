/*
 * This is the BootFoot program
 *
 * By: Troy Appleby
 * version 1.0
 * since   2024-03-03
 */

import java.util.Scanner;

/**
* This is the standard "BoardFoot" program.
*/
final class BoardFoot {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private BoardFoot() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Calculates the length of a board foot.
    *
    * @param widthFloat  The width of the board in inches.
    * @param heightFloat The height of the board in inches.
    * @return The length of the board foot.
    */
    public static float calculateBoardFoot(
        float widthFloat, float heightFloat) {
        final int boardFoot = 144;
        final float boardLength = boardFoot / (widthFloat * heightFloat);

        return boardLength;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // variables
        final Scanner scanner = new Scanner(System.in);
        final String invalidInput = "Invalid input.";

        // input
        System.out.print("Enter the width(inch): ");
        final String widthString = scanner.nextLine().trim();
        System.out.print("Enter the height(inch): ");
        final String heightString = scanner.nextLine().trim();

        // error check
        try {
            if (widthString.isEmpty() || heightString.isEmpty()) {
                System.out.println(invalidInput);
            } else {
                final float widthFloat =
                    Float.parseFloat(widthString);
                final float heightFloat =
                    Float.parseFloat(heightString);
                if (widthFloat < 0 || heightFloat < 0) {
                    System.out.println(invalidInput);
                } else {
                    // process
                    final float length = calculateBoardFoot(
                                    widthFloat, heightFloat
                                );
                    // output
                    System.out.println(
                        "The wood should be " + length
                        + " inch(es) long."
                    );
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println(invalidInput);
        }
        System.out.println("\nDone.");
    }
}
