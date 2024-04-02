package week04.interfaceexamples.interfaceexample;

public class CreditCardPayment implements PaymentMethod{
    private String cardNumber;
    private String expiryDate;
    private String cvc;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvc) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvc = cvc;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Credit card payment processed for amount : " + amount);
    }
}
