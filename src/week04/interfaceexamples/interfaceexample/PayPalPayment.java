package week04.interfaceexamples.interfaceexample;

public class PayPalPayment implements PaymentMethod{
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal payment processed for amount : " + amount);
    }
}
