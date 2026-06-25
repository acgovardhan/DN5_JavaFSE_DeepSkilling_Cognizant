package ObserverPatternExample;

public class WebApp implements Observer{
    
    @Override
    public void update(String price){
        System.out.println("price received in web :"+price);
    }
}
