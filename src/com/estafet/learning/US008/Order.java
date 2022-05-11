package com.estafet.learning.US008;

public abstract class Order {
    private final String ORDER_NAME = "ORR";
    private String orderNumber;
    private String clientDetails;
    private String listWithArticles;
    private String totalAmount;
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

