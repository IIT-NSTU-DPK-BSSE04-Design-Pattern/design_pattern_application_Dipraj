package design_pattern_application_Dipraj.com.payment;

public class SquarePayment {
    public void processPayment(double amount, String details) {
        System.out.println("Processing Square payment of " + amount + " for " + details);
    }

    public String getStatus(String transactionId) {
        return "Square Transaction " + transactionId + " Status: Completed";
    }
}
