package org.gaurav.repository;

public class HtmlReportGenerator implements ReportGenerator{
    @Override
    public String generateReport(int recordsPerPage) {
        return "Generated HTML report with " + recordsPerPage + " records.";
    }
}
