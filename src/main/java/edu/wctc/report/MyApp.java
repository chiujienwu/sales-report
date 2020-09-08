package edu.wctc.report;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp
{
    public static void main(String[] args)
    {
        // starts up spring
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        //my code
        ((Report)context.getBean("report")).OutputSalesReportToConsole();  //study this
    }
}
