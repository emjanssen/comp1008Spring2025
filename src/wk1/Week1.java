package wk1;

import java.io.Console;
import java.util.Scanner;

public class Week1 {

    // psvm+tab => public static void main(String[] args)

    public static void main(String[] args) {
            example2();
    }
    static void example2(){

//ctl+?
//        Scanner input = new Scanner(System.in);
//        String text = input.nextLine();
//        int num = input.nextInt();
//        short n1 = input.nextShort();

        Console console = System.console();
        System.out.println("What is your name?");
        String userName = console.readLine();
        System.out.println("What year were you born?");
        short birthYear = Short.parseShort(console.readLine());
        System.out.println("What is the temperature outside right now?");
        double temperature = Double.parseDouble(console.readLine());
        //String interpolation aka String formatting
        //Console.WriteLine($"Your name is {name}. You are {birthYear} years old. It is {temperature} degrees Celsius outside");

        //System.out.printf()
        //souf+tab
        /*
                    %s          String
                    %d          whole numbers such as int, short, long
                    %f          decimal numbers     float, double
         */

        System.out.printf("Your name is %s. You are %d years old. It is %.1f degrees Celsius outside\n",
                userName, 2025- birthYear, temperature);

        //let's calculate our age in months, days & hours

        int ageInYears = 2025 - birthYear;
        int ageInMonths = ageInYears * 12;
        double ageInDays = ageInYears * 365.25;
        double ageInHours = ageInDays * 24;

        System.out.printf("You are %d months old. That makes you %.1f days old, which makes you %.1f hours old\n",
                ageInMonths, ageInDays, ageInHours
                );

    }
    static void example1(){
        //sout+tab => System.out.println()

        System.out.println("Hello World");  // Console.WriteLine()

        Console console = System.console();

        System.out.println("What is your name?");
        String name = console.readLine();
        System.out.println("Hi, " + name);

    }
}
