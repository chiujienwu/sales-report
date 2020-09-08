package edu.wctc.report;

import java.math.BigDecimal;

public class Sale {
    private String customer;
    private String country;
    private BigDecimal amount;
    private BigDecimal tax;
    private BigDecimal shipping;

    public Sale(String customer, String country, BigDecimal amount, BigDecimal tax) {
        this.customer = customer;
        this.country = country;
        this.amount = amount;
        this.tax = tax;
    }

    public String getCustomer() {
        return customer;
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

    public void setShipping(BigDecimal shipping) {
        this.shipping = shipping;
    }

    public BigDecimal getShipping(){
        return shipping;
    }
}
