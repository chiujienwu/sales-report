package edu.wctc.report;

import edu.wctc.report.iface.SalesInput;
import edu.wctc.report.iface.SalesReport;
import edu.wctc.report.iface.ShippingPolicy;
import edu.wctc.report.impl.OutputSales;
import edu.wctc.report.impl.ReadSalesFile;
import edu.wctc.report.impl.Shipping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.report")
public class AppConfig {

    @Bean
    public SalesInput salesInput() {
        return new ReadSalesFile();
    }
    @Bean
    public SalesReport salesReport() {
        return new OutputSales();
    }
    @Bean
    public ShippingPolicy shippingPolicy() {
        return new Shipping();
    }


}
