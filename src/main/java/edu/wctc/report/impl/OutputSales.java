package edu.wctc.report.impl;

import edu.wctc.report.Sale;
import edu.wctc.report.iface.SalesReport;
import org.springframework.stereotype.Component;

import java.util.List;

public class OutputSales implements SalesReport {

    @Override
    public void generateReport(List<Sale> salesList) {

        System.out.printf("%-20s %-20s %-10s %-10s %-10s%n","Buyer", "Country", "Amount", "Tax", "Shipping");
        salesList.forEach((data) ->
                System.out.printf("%-20s %-20s %-10s %-10s %-10s%n",data.getCustomer(), data.getCountry(), data.getAmount(), data.getTax(), data.getShipping()));

    }
}

