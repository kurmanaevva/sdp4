package assignment9;

public abstract class ReportGenerator {
    // Template method
    public final void generateReport() {
        formatHeader();
        formatBody();
        formatFooter();
    }

    protected abstract void formatHeader();
    protected abstract void formatBody();
    protected abstract void formatFooter();
}