package com.estafet.learning.US002;

import com.estafet.learning.US003.Task3;
import com.estafet.learning.US004.Task4;

public class Main {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println(b);

        boolean t  = true;
        System.out.println(t);

        char capitalC = 'C';
        System.out.println(capitalC);

        String sampleString = "lorem ipsum";
        System.out.println(sampleString);

        Task3 task3 = new Task3();
        task3.task3();
        Task4 task4 = new Task4();
        task4.findPerimeter();
        task4.findSquare();
        task4.incrementValues();
        task4.decrementValues();
        task4.booleanStatementLogicalOperators();
    }
}
