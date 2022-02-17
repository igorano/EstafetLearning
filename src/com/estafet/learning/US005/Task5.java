package com.estafet.learning.US005;

import java.util.Scanner;

public class Task5 {

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
        System.out.print("Enter a number to view Fibonacci series: ");
        int count = reader.nextInt();
/*
        while(count < 0){
            System.out.println("Please enter a number that is greater than 0");
        }
*/

        int n1 = 0, n2 = 1, n3, i;
        System.out.print(n1 + " " + n2);

        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
