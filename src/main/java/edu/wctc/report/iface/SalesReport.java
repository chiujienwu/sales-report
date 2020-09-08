package edu.wctc.report.iface;

import edu.wctc.report.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}
