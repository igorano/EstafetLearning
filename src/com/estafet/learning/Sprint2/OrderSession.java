package com.estafet.learning.Sprint2;

public class OrderSession {

    public static void main(String[] args) {
        Order order1 = new Order(2021, 2000, 1000, 100, 10, "old signature", true);
        System.out.println(order1);
        System.out.println("---------------------------------");
        Order order2 = new Order(2022, 3000, 1000, 100, 95.5, "new signature", false);
        System.out.println(order2);
    }
}
