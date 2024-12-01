package design_pattern_application_Dipraj.com.payment;

public class Main {
    public static void main(String[] args) {
        // Payment details
        PaymentDetails paymentDetails = new PaymentDetails(100.0, "Purchase of item XYZ");

        // Create payment processors
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // PayPal Payment
        PayPalPayment payPalPayment = new PayPalPayment();
        PaymentGateway payPalAdapter = new PayPalAdapter(payPalPayment);
        paymentProcessor.processPayment(payPalAdapter, paymentDetails.getAmount(), paymentDetails.getDetails());
        paymentProcessor.getPaymentStatus(payPalAdapter, "PP12345");

        // Stripe Payment
        StripePayment stripePayment = new StripePayment();
        PaymentGateway stripeAdapter = new StripeAdapter(stripePayment);
        paymentProcessor.processPayment(stripeAdapter, paymentDetails.getAmount(), paymentDetails.getDetails());
        paymentProcessor.getPaymentStatus(stripeAdapter, "STRIPE12345");

        // Square Payment
        SquarePayment squarePayment = new SquarePayment();
        PaymentGateway squareAdapter = new SquareAdapter(squarePayment);
        paymentProcessor.processPayment(squareAdapter, paymentDetails.getAmount(), paymentDetails.getDetails());
        paymentProcessor.getPaymentStatus(squareAdapter, "SQUARE12345");
    }
}
