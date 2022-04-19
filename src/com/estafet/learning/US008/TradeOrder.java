package com.estafet.learning.US008;

public class TradeOrder extends Order {

    public TradeOrder() {

    }

    public void tradeOrder() {
        final String color = "red";
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
        hashCode();
    }
}