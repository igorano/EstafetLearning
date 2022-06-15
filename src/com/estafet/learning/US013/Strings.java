package com.estafet.learning.US013;

public class Strings {
    public static void  printAllOrders(){
        StringBuilder printAllOders=new StringBuilder("all");
        printAllOders.append(" orders");
        System.out.println(printAllOders);
    }
    public static void printAllInvoices(){
        StringBuilder printAllInvoices=new StringBuilder("all");
        printAllInvoices.append(" invoices");
        System.out.println(printAllInvoices);
    }

    public static void printVoice(){
        String value = "voice";
        String formattedString = String.format("print %s!", value);
        System.out.println(formattedString);
    }

    public static void printOrder(){
        String value = "order";
        String formattedString = String.format("print %s!", value);
        System.out.println(formattedString);
    }
    public static void main(String[] args){
        printAllOrders();
        printAllInvoices();
        printVoice();
        printOrder();
    }
}
