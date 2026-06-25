package Exercise7;

public class FinancialForecasting {

    // recursion : future value after n years = future value after n-1 years * (1 + rate)
    
    public double predictFutureValue(double value, int years, double rate){
        if(years == 0){
            return value;
        }
        return predictFutureValue(value, years-1, rate)*(1+rate);
    }
}
