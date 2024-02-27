/*
*This program calculates how long a microwave will take to heat food
*
* @author  Troy Appleby
* @version 1.0
* @since   2024-02-27
*/

import java.util.Scanner;

/**
 * This function calculates the time interval for various food items.
 */
final class Heat {
    /**
     * Constant for soup heat time.
    */
    public static final double SOUPINTERVAL = 105;
    /**
     * Constant for sub heat time.
    */
    public static final double SUBINTERVAL = 60;
    /**
     * Constant for pizza heat time.
    */
    public static final double PIZZAINTERVAL = 45;
    /**
     * Constant for heat time percent increase for two items.
    */
    public static final double PERCENTTWO = 1.5;
    /**
     * Constant for heat time percent increase for three items.
    */
    public static final double PERCENTTHREE = 2;
    /**
     * Constant for the number of seconds in a minute.
    */
    public static final double SIXTY = 60;
    /**
     * Constant for the number of items.
    */
    public static final String ONE = "1";
    /**
     * Constant for the number of items.
    */
    public static final String TWO = "2";
    /**
     * Constant for the number of items.
    */
    public static final String THREE = "3";
    /**
     * Constant for sub choice.
    */
    public static final String SUB = "sub";
    /**
     * Constant for soup choice.
    */
    public static final String SOUP = "soup";
    /**
     * Constant for pizza choice.
    */
    public static final String PIZZA = "pizza";
    /**
     * Variable for the total time that the microwave will heat the food.
    */
    private static double totaltime;
    /**
     * Variable for minutes.
    */
    private static double minutes;
    /**
     * Variable for seconds.
    */
    private static double seconds;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException if called
    *
    */
    private Heat() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // input
        final Scanner foodInput = new Scanner(System.in);
        final Scanner itemNumber = new Scanner(System.in);
        System.out.println("What do you want to heat sub, pizza, or soup): ");
        final String userInput = foodInput.nextLine();
        System.out.println("How many of this item do you want to heat?: ");
        final String userInput2 = itemNumber.nextLine();
        // process & output
        //   this inherently checks if the user's input
        //   corresponds with the conditions.
        if (userInput.equals(SOUP) || userInput.equals(PIZZA)
               || userInput.equals(SUB)) {

            if (userInput.equals(SOUP)) {
                totaltime = SOUPINTERVAL;
            } else if (userInput.equals(PIZZA)) {
                totaltime = PIZZAINTERVAL;
            } else if (userInput.equals(SUB)) {
                totaltime = SUBINTERVAL;
            }

            if (userInput2.equals(ONE) || userInput2.equals(TWO)
                                || userInput2.equals(THREE)) {
                if (userInput2.equals(TWO)) {
                    totaltime = totaltime * PERCENTTWO;
                } else if (userInput2.equals(THREE)) {
                    totaltime = totaltime * PERCENTTHREE;
                }
                seconds = totaltime / SIXTY;
                minutes = Math.floor(seconds);
                seconds = (seconds - minutes) * SIXTY;
                System.out.println("\nThe total time elapsed will be "
                                + minutes
                                + " minutes and " + seconds + " seconds.");
            } else {
                System.out.println("That is an invalid number.");
            }
        } else {
            System.out.println("That is an invalid input.");
        }
        System.out.println("\nDone.");
    }
}
