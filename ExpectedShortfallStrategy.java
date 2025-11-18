public class ExpectedShortfallStrategy implements RiskAlgorithm {
    @Override
    public String calculate(FinancialContext context) {
        double es = context.getPortfolioValue() * context.getVolatility() * 2.67; // ES a 97.5% (simulado)
        String result = String.format("Expected Shortfall (ES): Pior perda média de R$ %.2f", es);
        System.out.println("LOG: Executando cálculo ES com dados históricos...");
        return result;
    }
}