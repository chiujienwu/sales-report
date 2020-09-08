package edu.wctc.report;

import edu.wctc.report.iface.SalesInput;
import edu.wctc.report.iface.SalesReport;
import edu.wctc.report.iface.ShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Report {

    private SalesInput in;
    private SalesReport out;
    private ShippingPolicy ship;
    private List<Sale> sales = new ArrayList<>();

    @Autowired
    public Report(SalesInput in, SalesReport out, ShippingPolicy ship) {
        this.in = in;
        this.out = out;
        this.ship = ship;
        System.out.println("Sales Report created");
    }

    public void OutputSalesReportToConsole(){
        sales = in.getSales();
        for(int x=0; x < sales.size(); x++){
            sales.get(x).setShipping(ship.getShippingCost(sales.get(x)));  //spend more time on this
        }
        out.generateReport(sales);
    }
}
