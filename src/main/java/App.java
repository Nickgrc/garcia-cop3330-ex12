import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nickolas Garcia
 */

//Create a program that computes simple interest. Prompt for the principal amount, the rate as a percentage, and the time, and display the amount accrued (principal + interest).
//
//The formula for simple interest is A = P(1 + rt), where P is the principal amount, r is the annual rate of interest, t is the number of years the amount is invested, and A is the amount at the end of the investment.
//
//Example Output
//Enter the principal: 1500
//Enter the rate of interest: 4.3
//Enter the number of years: 4
//After 4 years at 4.3%, the investment will be worth $1758.
//Constraints
//Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
//Ensure that fractions of a cent are rounded up to the next penny.
//Ensure that the output is formatted as money.



public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final double con = 100;
        final double one = 1;

        System.out.print("Enter the principal: ");
        String principal = in.nextLine();

        System.out.print("Enter the rate of interest: ");
        String interest = in.nextLine();

        System.out.print("Enter the number of years: ");
        String years = in.nextLine();

        int a = Integer.parseInt(principal);
        double b = Double.parseDouble(interest);
        int c = Integer.parseInt(years);
        double x = b / con;
        double fin = a * one + a * x * c;

        String s = String.format("%.2f", fin);

        System.out.print("After " + c + " years at " + b + "%," + " the investment will be worth $" + s + ".");

    }
}
