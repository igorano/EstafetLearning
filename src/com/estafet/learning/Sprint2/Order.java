package com.estafet.learning.Sprint2;

public class Order {
    int year;
    long amount;
    double maxNumOfPages;
    double numberOfPages;
    double numberOfPagesLeft;
    String employSignature;
    boolean isEOrder;

    public Order(int year, long amount, double maxNumOfPages, double numberOfPages, double numberOFPagesLeft, String employSignature, boolean isEOrder) {
        this.year = year;
        this.amount = amount;
        this.maxNumOfPages = maxNumOfPages;
        this.numberOfPages = numberOfPages;
        this.numberOfPagesLeft = numberOFPagesLeft;
        this.employSignature = employSignature;
        this.isEOrder = isEOrder;
    }

    @Override
    public String toString() {
        return "Year is : " + year + " " + "\n" +
                "Amount is : " + amount + " " + "\n" +
                "Max number of pages is : " + maxNumOfPages + " " + "\n" +
                "Number of Pages is : " + numberOfPages + " " + "\n" +
                "Number of pages left is : " + numberOfPagesLeft + " " + "\n" +
                "Employ signature is : " + employSignature + " " + "\n" +
                "It is electronic order : " + isEOrder + " " + "\n";
    }
}
