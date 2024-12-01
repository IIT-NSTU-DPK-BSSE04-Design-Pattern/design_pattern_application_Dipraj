package design_pattern_application_Dipraj.com.payment;

public class PaymentDetails {
    private double amount;
    private String details;

    public PaymentDetails(double amount, String details) {
        this.amount = amount;
        this.details = details;
    }

    public double getAmount() {
        return amount;
    }

    public String getDetails() {
        return details;
    }
}
