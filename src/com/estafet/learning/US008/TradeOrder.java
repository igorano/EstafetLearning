package com.estafet.learning.US008;

public class TradeOrder extends Order {
    final String color = "red";

    public TradeOrder() {
        super();
    }

    public TradeOrder(String orderNumber, String clientDetails, String color) {
    }

    public void tradeOrder() {
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
        hashCode();
    }
}