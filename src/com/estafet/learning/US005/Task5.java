package com.estafet.learning.US005;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
/*        checkNumberIsEvenOrOdd();
        Fibonacii();
        Factorial();
        FactorialOfOddNumbers();*/
        addTwoNumbers();
    }

    public static int number;

    public static void checkNumberIsEvenOrOdd() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number to check is it even or odd: ");
        int num = reader.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }

    public static void Fibonacii() {
        Scanner reader = new Scanner(System.in);
        System.out.format("Enter a number to view Fibonacci series: %n");

        do {
            System.out.format("Please enter a positive number!");
            while (!reader.hasNextInt()) {
                System.out.println("That's not a number!");
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
        System.out.format("Please enter a positive number to view Factorial of it: %n");

        do {
            while (!reader.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.format("Enter a positive number to view Factorial of it: %n");
                reader.next();
            }
            number = reader.nextInt();
        } while (number <= 0);

        long i, fact = 1;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
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
            System.out.println("Factorial of " + number + " is: " + fact);
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
}
