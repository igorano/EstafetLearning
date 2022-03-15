package com.estafet.learning.Sprint2;

public class OrderSession {
    static double numberOfPages;
    static double numberOFPagesLeft;
    static double maxNumOfPages;

    public static void main(String[] args) {
        numberOfPages = 100;
        maxNumOfPages = 1000;
        Order order1 = new Order(2021, 2000, maxNumOfPages, numberOfPages, usedPages(10), changeEmploySignature("old signature"), true);
        System.out.println(order1);
        System.out.println("---------------------------------");
        Order order2 = new Order(2022, 3000, maxNumOfPages, numberOfPages, usedPages(95.5), changeEmploySignature("new signature"), false);
        System.out.println(order2);
    }

    private static String changeEmploySignature(String newEmploySignature) {
        return newEmploySignature;
    }

    private static double usedPages(double pages) {
        numberOFPagesLeft = numberOfPages - pages;
        if (pages >= numberOfPages) {
            System.out.println("Please enter number of pages between 0 and 100.");
        }
        return numberOFPagesLeft;
    }
}
