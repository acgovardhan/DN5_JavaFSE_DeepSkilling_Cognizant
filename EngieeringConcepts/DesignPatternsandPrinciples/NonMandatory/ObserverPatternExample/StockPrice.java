package ObserverPatternExample;

public class StockPrice {
    private String newprice;

    StockPrice(String newprice){
        this.newprice = newprice;
    }

    String getPrice(){
        return newprice;
    }

}
