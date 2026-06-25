package ObserverPatternExample;

public class MobileApp implements Observer {
    
    @Override
    public void update(String price){
        System.out.println("price received in mobile :"+price);
    }
}
