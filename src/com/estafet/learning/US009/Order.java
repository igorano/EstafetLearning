package com.estafet.learning.US009;

public class Order implements  InvoiceCalculations{

    TradeInvoice tradeInv = new TradeInvoice();

    public void someCalculations(){
        int variable = tradeInv.variable;
    }
}
