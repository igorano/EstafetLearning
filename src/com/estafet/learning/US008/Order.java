package com.estafet.learning.US008;

public abstract class Order {
    public static final String ORDER_NAME = "ORR";
    public String OrderNumber;
    public String ClientDetails;
    public String ListWithArticles;
    public String TotalAmount;
    private static final int invoice = 1;
    public static final String color = "green";

    public Order(){
    }

    public Order(String orderNumber, String clientDetails){
        this.OrderNumber = orderNumber;
        this.ClientDetails = clientDetails;
    }

    public Order(String orderNumber,String clientDetails,String listWithArticles,String totalAmount){
        this.OrderNumber = orderNumber;
        this.ClientDetails = clientDetails;
        this.ListWithArticles = listWithArticles;
        this.TotalAmount = totalAmount;
    }
}

