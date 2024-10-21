package assignment9;

public class Main {
    public static void main(String[] args) {
        ReportingSystem reportingSystem = new ReportingSystem();

        System.out.println("PDF Report:");
        ReportGenerator pdfGenerator = new PDFReportGenerator();
        reportingSystem.generateReport(pdfGenerator);

        System.out.println("\nHTML Report:");
        ReportGenerator htmlGenerator = new HTMLReportGenerator();
        reportingSystem.generateReport(htmlGenerator);

        System.out.println("\nPlain Text Report:");
        ReportGenerator plainTextGenerator = new PlainTextReportGenerator();
        reportingSystem.generateReport(plainTextGenerator);
    }
}