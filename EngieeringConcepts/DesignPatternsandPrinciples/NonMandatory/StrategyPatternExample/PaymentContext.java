package StrategyPatternExample;

public class PaymentContext {

    void spendMoney(PaymentStrategy paymentstrategy, int amount){
        paymentstrategy.pay(amount);
    }
}
