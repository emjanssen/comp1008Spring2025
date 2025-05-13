package wk2;

import java.io.Console;

public class Week2 {

    public static void budget() {
        double limit = 200; // per month
        double expenses = 0;

        Console console = System.console();

        while (expenses <= limit) {
            System.out.println("Enter an expense value: ");
            expenses = Double.parseDouble(console.readLine());
            System.out.printf("Your total value is now: $%.2f\n", expenses);
        }

    }

    public static void main(String[] args) {}
}
