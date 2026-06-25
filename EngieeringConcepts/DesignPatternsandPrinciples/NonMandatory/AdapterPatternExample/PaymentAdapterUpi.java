package AdapterPatternExample;

public class PaymentAdapterUpi implements PaymentProcessor{

    private ThirdPartyPaymentGatewayUpi gateway = new ThirdPartyPaymentGatewayUpi();

    @Override
    public void processPayment(){
        gateway.upi();
    }
}
