package design_pattern_application_Dipraj.com.payment;

public class SquareAdapter implements PaymentGateway {
    private SquarePayment squarePayment;

    public SquareAdapter(SquarePayment squarePayment) {
        this.squarePayment = squarePayment;
    }

    @Override
    public void initializePayment(double amount, String details) {
        squarePayment.processPayment(amount, details);
    }

    @Override
    public String getPaymentStatus(String transactionId) {
        return squarePayment.getStatus(transactionId);
    }
}
