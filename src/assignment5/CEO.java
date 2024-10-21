package assignment5;

public class CEO extends Approver {

    @Override
    public void handleRequest(ExpenseRequest request) {
        System.out.println("CEO approved request of $" + request.getAmount() + " for " + request.getPurpose());
    }
}