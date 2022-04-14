package com.estafet.learning.US008;

public abstract class Order {
    public static final String ORDER_NAME = "ORR";
    public String orderNumber;
    public String ClientDetails;
    public String ListWithArticles;
    public String TotalAmount;
    private static final int invoice = 1;
    public static final String color = "green";

    public Order(){
    }

    public Order(String orderNumber, String ClientDetails){
        this.orderNumber = orderNumber;
        this.ClientDetails = ClientDetails;
    }

    public Order(String orderNumber,String ClientDetails,String ListWithArticles,String TotalAmount){
        this.orderNumber = orderNumber;
        this.ClientDetails = ClientDetails;
        this.ListWithArticles = ListWithArticles;
        this.TotalAmount = TotalAmount;
    }
}

