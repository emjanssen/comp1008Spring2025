package wk2;

import java.io.Console;

public class Week2 {

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

    public static void main(String[] args) {}
}
