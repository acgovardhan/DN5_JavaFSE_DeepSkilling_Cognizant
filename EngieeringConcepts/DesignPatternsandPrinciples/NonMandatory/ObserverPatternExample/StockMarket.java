package ObserverPatternExample;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock{
    
    private List<Observer> clients = new ArrayList<>();

    @Override
    public void register(Observer observer){
        clients.add(observer);
    }

    @Override
    public void deregister(Observer observer){
        clients.remove(observer);
    }

    @Override
    public void notifyObservers(StockPrice stockprice){
        for(Observer observer : clients){
            observer.update(stockprice.getPrice());
        }
    }

    public void addPrice(String price){
        notifyObservers(new StockPrice(price));
    }
}
