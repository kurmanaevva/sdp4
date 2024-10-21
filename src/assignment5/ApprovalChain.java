package assignment5;

public class ApprovalChain {

    private Approver teamLead;
    private Approver manager;
    private Approver director;
    private Approver ceo;

    public ApprovalChain() {
        teamLead = new TeamLead();
        manager = new Manager();
        director = new Director();
        ceo = new CEO();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(ceo);
    }

    public void processRequest(ExpenseRequest request) {
        teamLead.handleRequest(request);
    }
}