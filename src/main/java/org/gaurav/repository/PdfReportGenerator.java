package org.gaurav.repository;

public class PdfReportGenerator implements ReportGenerator {
    @Override
    public String generateReport(int recordsPerPage) {
        return "Generated PDF report with " + recordsPerPage + "records.";
    }
}
