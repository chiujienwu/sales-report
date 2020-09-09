package edu.wctc.report.impl;

import edu.wctc.report.Sale;
import edu.wctc.report.SalesSummary;
import edu.wctc.report.iface.SalesReport;

import java.util.*;

public class OutputSales implements SalesReport {

    @Override
    public void generateReport(List<Sale> salesList) {

        System.out.printf("%-25s %-20s %-10s %-10s %-10s%n","Buyer", "Country", "Amount", "Tax", "Shipping");
        salesList.forEach((data) ->
                System.out.printf("%-25s %-20s $%-10.2f $%-10.2f $%-10.2f%n",data.getCustomer(), data.getCountry(), data.getAmount(), data.getTax(), data.getShipping()));

        Set countries = new HashSet();
        List<SalesSummary> summary = new ArrayList<>();

        for (Sale data: salesList) {
            // String country = data.getCountry();
            if(!countries.contains(data.getCountry())){
                countries.add(data.getCountry());
                System.out.println(countries);
                summary.add(new SalesSummary(data));
            } else {
                for (SalesSummary summaryData : summary) {
                    System.out.println(summaryData.getCountry());
                    System.out.println(data.getCountry());
                    // System.out.println(summaryData.getCountry() == data.getCountry());
                    // System.out.println(summaryData.getCountry() instanceof String);
                    // System.out.println(data.getCountry() instanceof String);
                    if(summaryData.getCountry().equals(data.getCountry())){
                        // int summaryIndex = summary.indexOf(summaryData);
                        summary.get(summary.indexOf(summaryData)).addAmount(data.getAmount());
                        summary.get(summary.indexOf(summaryData)).addTax(data.getTax());
                        summary.get(summary.indexOf(summaryData)).addShipping(data.getShipping());
                    }
                }
            }
        }
        System.out.println(countries);
        System.out.printf("%-20s %-10s %-10s %-10s%n","Country", "Amount", "Tax", "Shipping");
        summary.forEach((country) ->
                System.out.printf("%-20s $%-10.2f $%-10.2f $%-10.2f%n",country.getCountry(), country.getAmount(), country.getTax(), country.getShipping()));

    }
}

