package com.estafet.learning.US008;

public abstract class Order {
    public static final String ORDER_NAME = "ORR";
    public String orderNumber;
    public String clientDetails;
    public String listWithArticles;
    public String totalAmount;
    private static final int invoice = 1;
    public static final String color = "green";

    public Order() {
    }

    public Order(String orderNumber, String clientDetails) {
        this.orderNumber = orderNumber;
        this.clientDetails = clientDetails;
    }

    public Order(String orderNumber, String clientDetails, String listWithArticles, String totalAmount) {
        this.orderNumber = orderNumber;
        this.clientDetails = clientDetails;
        this.listWithArticles = listWithArticles;
        this.totalAmount = totalAmount;
    }
}

