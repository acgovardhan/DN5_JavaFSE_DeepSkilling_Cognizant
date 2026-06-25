package AdapterPatternExample;

public class PaymentAdapterVisa implements PaymentProcessor{

    private ThirdPartyPaymentGatewayVisa gateway = new ThirdPartyPaymentGatewayVisa();

    @Override
    public void processPayment(){
        gateway.visa();
    }
}
