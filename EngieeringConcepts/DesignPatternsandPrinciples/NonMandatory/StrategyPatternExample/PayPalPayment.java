package StrategyPatternExample;

public class PayPalPayment implements PaymentStrategy{

    private String paypalId;

    PayPalPayment(String paypalId){
        this.paypalId = paypalId;
    }
    
    @Override
    public void pay(int amount){
        System.out.println("paying using paypal, id:("+paypalId+") amount : "+amount);
    }
}
