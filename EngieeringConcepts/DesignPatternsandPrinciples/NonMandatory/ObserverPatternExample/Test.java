package ObserverPatternExample;

public class Test {
    public static void main(String[] args) {
        Observer mobile =  new MobileApp();
        Observer web = new WebApp();

        StockMarket stockmarket = new StockMarket();
        stockmarket.register(mobile);
        stockmarket.register(web);

        stockmarket.deregister(mobile);
        stockmarket.addPrice("28 rupee change in stock");
    }
}
