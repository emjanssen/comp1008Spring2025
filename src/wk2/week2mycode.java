package wk2;

import java.io.Console;

public class week2mycode {

    public static void budget() {
        double limit = 200; // per month
        double expenses = 0;
        double userValueEntered = 0;

        Console console = System.console();

        while (expenses <= limit) {
            System.out.println("Enter an expense value: ");
            userValueEntered = Double.parseDouble(console.readLine());

            if (expenses + userValueEntered > limit)
                System.out.printf("Sorry but adding $%.2f to expenses will make you go over your $%.2f budget", userValueEntered, limit);
            break;
        }
        // expenses = Double.parseDouble(console.readLine());
        expenses += userValueEntered;
        System.out.printf("Your total value is now: $%.2f\n", expenses);
    }

    public static void budget2() {

        double userLimitEntered = 0;
        double userExpenseEntered = 0;
        boolean isValidLimit = true;
        boolean isValidExpense = false;

        Console console = System.console();

        while (isValidLimit) {
            System.out.println("Please enter an expense limit: ");
            userLimitEntered = Double.parseDouble(console.readLine());

            if (userLimitEntered < 200 || userLimitEntered > 1000) {
                System.out.println("Sorry, but you entered invalid values.");
                isValidLimit = false;
                break;
            }

            if (userLimitEntered >= 200 && userLimitEntered <= 1000) {
                System.out.printf("You have entered a valid expense limit of $%.2f", userLimitEntered);
                isValidLimit = true;

                while (isValidExpense) {

                    System.out.println("Please enter an expense value that is 15% or less of your budget: ");
                    userExpenseEntered = Double.parseDouble(console.readLine());

                    if (userExpenseEntered > (userLimitEntered * .15)) {
                        System.out.println("You have entered an invalid expense value");
                        isValidExpense = false;
                        return;

                    } if (userExpenseEntered <= (userLimitEntered * .15))
                        System.out.printf("You have entered a valid expense value of $%.2f", userExpenseEntered);
                }
            }
        }
    }

    public static void main(String[] args) {
        budget();
        budget2();
    }
}


/* corrections:

if (userValueEntered > Math.round(userValueEntered * 0.15)
$%d for digit intstead of f for float; using Math.round() will round to a whole number, so we can use digit
char answer = console.readLine().toLowerCase().trim().charAt(0); gets the first character in that string

*/