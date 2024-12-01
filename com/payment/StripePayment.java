package design_pattern_application_Dipraj.com.payment;

public class StripePayment {
    public void processPayment(double amount, String details) {
        System.out.println("Processing Stripe payment of " + amount + " for " + details);
    }

    public String getStatus(String transactionId) {
        return "Stripe Transaction " + transactionId + " Status: Completed";
    }
}
