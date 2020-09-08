package edu.wctc.report.iface;

import edu.wctc.report.Sale;

import java.math.BigDecimal;

public interface ShippingPolicy {
    BigDecimal getShippingCost(Sale sale);
}
