package com.example.vjk;

public class AddTwoNumbers {

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers as arguments.");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            double sum = add(num1, num2);

            System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid numbers.");
        }
    }
}
