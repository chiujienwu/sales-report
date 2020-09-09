package edu.wctc.report;

import java.math.BigDecimal;

public class SalesSummary {
    private String country;
    private BigDecimal amount;
    private BigDecimal tax;
    private BigDecimal shipping;

    public SalesSummary (Sale sale) {
        this.country = sale.getCountry();
        this.amount = sale.getAmount();
        this.tax = sale.getTax();
        this.shipping = sale.getShipping();
    }

    public String getCountry() {
        return country;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public BigDecimal getShipping() {
        return shipping;
    }

    public void addAmount(BigDecimal amount) {
        this.amount = this.amount.add(amount);
    }

    public void addTax(BigDecimal tax) {
        this.tax = this.tax.add(tax);
    }

    public void addShipping(BigDecimal shipping) {
        this.shipping = this.shipping.add(shipping);
    }
}
