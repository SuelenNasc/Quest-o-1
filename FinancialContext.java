public class FinancialContext {
    private final double portfolioValue;
    private final double volatility;
    private final double riskFreeRate;
    private final int timeHorizonDays;

    public FinancialContext(double portfolioValue, double volatility, double riskFreeRate, int timeHorizonDays) {
        this.portfolioValue = portfolioValue;
        this.volatility = volatility;
        this.riskFreeRate = riskFreeRate;
        this.timeHorizonDays = timeHorizonDays;
    }

    public double getPortfolioValue() { return portfolioValue; }
    public double getVolatility() { return volatility; }
    public double getRiskFreeRate() { return riskFreeRate; }
    public int getTimeHorizonDays() { return timeHorizonDays; }

    @Override
    public String toString() {
        return String.format(
            "Contexto[Valor=%.2f, Vol=%.2f, Dias=%d]", 
            portfolioValue, volatility, timeHorizonDays
        );
    }
}