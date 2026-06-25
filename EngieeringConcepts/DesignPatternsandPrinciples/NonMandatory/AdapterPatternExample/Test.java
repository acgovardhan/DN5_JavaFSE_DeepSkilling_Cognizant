package AdapterPatternExample;

public class Test {
    public static void main(String[] args) {
        
        PaymentProcessor upi = new PaymentAdapterUpi();
        upi.processPayment();

        PaymentProcessor visa = new PaymentAdapterVisa();
        visa.processPayment();
    }
}
