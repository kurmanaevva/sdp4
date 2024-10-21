package assignment5;

public class Main {
    public static void main(String[] args) {
        ApprovalChain approvalChain = new ApprovalChain();

        ExpenseRequest request1 = new ExpenseRequest(500, "Office Supplies");
        ExpenseRequest request2 = new ExpenseRequest(2500, "Team Building Event");
        ExpenseRequest request3 = new ExpenseRequest(12000, "New Computers");
        ExpenseRequest request4 = new ExpenseRequest(50000, "New Office Renovation");

        System.out.println("Processing requests...");
        approvalChain.processRequest(request1); // Should be approved by TeamLead
        approvalChain.processRequest(request2); // Should be approved by Manager
        approvalChain.processRequest(request3); // Should be approved by Director
        approvalChain.processRequest(request4); // Should be approved by CEO
    }
}