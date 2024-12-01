package design_pattern_application_Dipraj.com.payment;

public class PayPalPayment {
    public void processPayment(double amount, String details) {
        System.out.println("Processing PayPal payment of " + amount + " for " + details);
    }

    public String getStatus(String transactionId) {
        return "PayPal Transaction " + transactionId + " Status: Completed";
    }
}
