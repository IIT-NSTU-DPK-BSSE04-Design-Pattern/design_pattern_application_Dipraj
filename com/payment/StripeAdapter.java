package design_pattern_application_Dipraj.com.payment;

public class StripeAdapter implements PaymentGateway {
    private StripePayment stripePayment;

    public StripeAdapter(StripePayment stripePayment) {
        this.stripePayment = stripePayment;
    }

    @Override
    public void initializePayment(double amount, String details) {
        stripePayment.processPayment(amount, details);
    }

    @Override
    public String getPaymentStatus(String transactionId) {
        return stripePayment.getStatus(transactionId);
    }
}
