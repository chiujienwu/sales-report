package edu.wctc.report.impl;

import edu.wctc.report.Sale;
import edu.wctc.report.iface.ShippingPolicy;

import java.math.BigDecimal;

public class Shipping implements ShippingPolicy {
    @Override
    public BigDecimal getShippingCost(Sale sale) {

        String country = sale.getCountry();
        double shippingCost = 0.00;

        switch (country) {
            case "United States":
                shippingCost = 8.00;
                break;
            case "India":
                shippingCost = 22.00;
                break;
            case "Japan":
                shippingCost = 20.00;
                break;
            case "Scotland":
                shippingCost = 18.00;
                break;
            default:
                shippingCost = 15.00;
        }

        return new BigDecimal(shippingCost);
    }
}
