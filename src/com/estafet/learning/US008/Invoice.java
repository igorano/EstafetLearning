package com.estafet.learning.US008;

import java.util.Objects;

public abstract class Invoice extends Order {
    public static final String INVOICE_NAME = "INV";
    public String orderNumber;
    public String clientDetails;
    public String listWithArticles;
    public String totalAmount;
}

class TradeInvoice extends Invoice {
    TradeInvoice td = new TradeInvoice();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TradeInvoice that = (TradeInvoice) o;
        return Objects.equals(td, that.td);
    }

    @Override
    public int hashCode() {
        return Objects.hash(td);
    }
}