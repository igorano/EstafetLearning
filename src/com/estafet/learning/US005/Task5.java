package com.estafet.learning.US005;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        checkNumberIsEvenOrOdd();
        Fibonacii();
        Factorial();
        FactorialOfOddNumbers();
        addTwoNumbers();
        numberOfDaysInMonth();
    }

    public static int number;

    public static void checkNumberIsEvenOrOdd() {
        Scanner reader = new Scanner(System.in);

        System.out.format("Enter a number to check is it even or odd: %n");
        int num = reader.nextInt();

        if (num % 2 == 0)
            System.out.format(num + " is even%n");
        else
            System.out.format(num + " is odd%n");
    }

    public static void Fibonacii() {
        Scanner reader = new Scanner(System.in);
        System.out.format("Enter a number to view Fibonacci series: %n");

        do {
            System.out.format("Please enter a positive number!%n");
            while (!reader.hasNextInt()) {
                System.out.format("That's not a number!%n");
                System.out.format("Enter a number to view Fibonacci series: %n");
                reader.next();
            }
            number = reader.nextInt();
        } while (number <= 0);

        int n1 = 0, n2 = 1, n3, i;
        System.out.print(n1 + " " + n2);

        for (i = 2; i < number; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void Factorial() {
        Scanner reader = new Scanner(System.in);
        System.out.format("%nPlease enter a positive number to view Factorial of it: %n");

        do {
            while (!reader.hasNextInt()) {
                System.out.format("That's not a number!%n");
                System.out.format("Enter a positive number to view Factorial of it: %n");
                reader.next();
            }
            number = reader.nextInt();
        } while (number <= 0);

        long i, fact = 1;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.format("Factorial of " + number + " is: " + fact + "%n");
    }

    public static void FactorialOfOddNumbers() {
        Scanner reader = new Scanner(System.in);
        System.out.format("Please enter a positive and odd number to view Factorial of it: %n");
        number = reader.nextInt();

        if (number > 0 && number % 2 != 0) {
            long i, fact = 1;
            for (i = 1; i <= number; i++) {
                fact = fact * i;
            }
            System.out.format("Factorial of " + number + " is: " + fact + "%n");
        } else {
            System.out.format("Please enter a positive and odd number to view Factorial of it: %n");
        }
    }

    public static void addTwoNumbers() {
        Scanner reader = new Scanner(System.in);
        do {
            System.out.format("Please enter two numbers to calculate the sum of them: %n");
            int numberOne = reader.nextInt();
            int numberTwo = reader.nextInt();
            int sum = numberOne + numberTwo;
            System.out.format("The sum of these numbers " + numberOne + " and " + numberTwo + " is : " + sum + "%n");

            System.out.format("Would you like to do this operation again? ");
        }
        while (!reader.next().equals("no"));
    }

    public static void numberOfDaysInMonth() {
        Scanner input = new Scanner(System.in);
        int number_Of_DaysInMonth = 0;

        System.out.format("Input a month number between 1 and 12: %n");
        int month = input.nextInt();
        if (month < 1 || month > 12) {
            System.out.format("This is not a valid month.%n");
        }

        System.out.format("Input a year: ");
        int year = input.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 12:
            case 10:
            case 8:
            case 7:
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 4:
            case 6:
            case 11:
            case 9:
                number_Of_DaysInMonth = 30;
                break;
        }
        System.out.format("This month of " + year + " has " + number_Of_DaysInMonth + " days.%n");
    }
}
