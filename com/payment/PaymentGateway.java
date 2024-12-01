package design_pattern_application_Dipraj.com.payment;

public interface PaymentGateway {
    void initializePayment(double amount, String details);
    String getPaymentStatus(String transactionId);
}
