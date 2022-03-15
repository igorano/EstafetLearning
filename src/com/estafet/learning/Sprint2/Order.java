package com.estafet.learning.Sprint2;

public class Order {
    int year;
    long amount;
    double maxNumOfPages;
    double numberOfPages;
    double numberOfPagesLeft;
    String employSignature;
    boolean isEOrder;

    public Order(int year, long amount, double maxNumOfPages, double numberOfPages, double numberOfPagesLeft, String employSignature, boolean isEOrder) {
        this.year = year;
        this.amount = amount;
        this.maxNumOfPages = maxNumOfPages;
        this.numberOfPages = numberOfPages;
        this.numberOfPagesLeft = usedPages(numberOfPagesLeft);
        this.employSignature = changeEmploySignature(employSignature);
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

    private static String changeEmploySignature(String newEmploySignature) {
        return newEmploySignature;
    }

    private double usedPages(double pages) {
        numberOfPagesLeft = numberOfPages - pages;
        if (pages >= numberOfPages) {
            System.out.println("Please enter number of pages between 0 and 100.");
        }
        return numberOfPagesLeft;
    }
}
