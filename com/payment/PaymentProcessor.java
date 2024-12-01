package design_pattern_application_Dipraj.com.payment;

public class PaymentProcessor {

    public void processPayment(PaymentGateway paymentGateway, double amount, String details) {
        paymentGateway.initializePayment(amount, details);
    }

    public void getPaymentStatus(PaymentGateway paymentGateway, String transactionId) {
        System.out.println(paymentGateway.getPaymentStatus(transactionId));
    }
}
