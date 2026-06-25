package StrategyPatternExample;

public class Test {
    public static void main(String[] args) {
        
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.spendMoney(new CreditCardPayment("creditcard@johndoe"), 100);

        paymentContext.spendMoney(new PayPalPayment("user@paypal"), 250);
    }
}
