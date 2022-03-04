package com.estafet.learning.Sprint2;

public class Order {
    public Order(int year, long amount, double maxNumOfPages, double numberOfPages, double numberOFPagesLeft, String employSignature, boolean isEOrder) {
        System.out.println("Year is : " + year + " ");
        System.out.println("Amount is : " + amount + " ");
        System.out.println("Max number of pages is : " + maxNumOfPages + " ");
        System.out.println("Number of Pages is : " + numberOfPages + " ");
        System.out.println("Number of pages left is : " + numberOFPagesLeft + " ");
        System.out.println("Employ signature is : " + employSignature + " ");
        System.out.println("It is electronic order : " + isEOrder + " ");
    }
}
