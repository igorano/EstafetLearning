package com.estafet.learning.US008;

import java.util.Objects;

class TradeInvoice extends Invoice {
    TradeInvoice td = new TradeInvoice();
    TradeInvoice td2 = new TradeInvoice();

    public void compareObjects(){
        System.out.println(td.equals(td2));
    }

    public TradeInvoice() {
        super();
    }

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
    TradeInvoice order = (TradeInvoice) new Invoice();
}