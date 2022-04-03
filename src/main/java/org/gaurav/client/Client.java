package org.gaurav.client;

import org.gaurav.service.ReportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ReportService reportService = context.getBean("reportService1", ReportService.class);
        reportService.display();
        ReportService reportService1 = context.getBean("reportService2", ReportService.class);

        System.out.println(reportService1 == reportService);
        reportService1.display();
    }
}
