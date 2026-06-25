package StrategyPatternExample;

public class CreditCardPayment implements PaymentStrategy{
    
    private String cardId;

    CreditCardPayment(String cardId){
        this.cardId = cardId;
    }

    @Override
    public void pay(int amount){
        System.out.println("paying using credicard, id:("+cardId+") amount: "+amount);
    }
}
