package design_pattern_application_Dipraj.com.payment;

public class PayPalAdapter implements PaymentGateway {
    private PayPalPayment payPalPayment;

    public PayPalAdapter(PayPalPayment payPalPayment) {
        this.payPalPayment = payPalPayment;
    }

    @Override
    public void initializePayment(double amount, String details) {
        payPalPayment.processPayment(amount, details);
    }

    @Override
    public String getPaymentStatus(String transactionId) {
        return payPalPayment.getStatus(transactionId);
    }
}
