package Exercise7;


public class Test {
    public static void main(String[] args) {
        
        FinancialForecasting financialForecasting = new FinancialForecasting();

        double predictedValue = financialForecasting.predictFutureValue(5000, 5, 0.1);

        System.out.println("predicted value : "+predictedValue);

        //Analysis
        //Time complexity: O(n), one call per year.
        //Space complexity: O(n), recursive call uses stack space.

        //use memoization to optimize recursive sol
    }
}
