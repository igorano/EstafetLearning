package com.estafet.learning.US008;

public class TradeOrder extends Order {
    final String color = "red";

    public TradeOrder() {

    }

    public void tradeOrder() {
        System.out.println(color);//prints color of Dog class
        System.out.println(Order.color);//prints color of Animal class
        hashCode();
    }
}