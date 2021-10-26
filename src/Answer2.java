/*
2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.


 */

import java.util.Scanner;

public class Answer2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Enter number;");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                if (number > max) {
                    max = number;

                }
                if (number < min) {
                    min = number;

                }


            } else {
                break;

            }
            scanner.nextInt();


        }
        System.out.println("Min=" + min + "Max=" + max);
        scanner.close();

    }
}
