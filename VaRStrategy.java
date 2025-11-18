public class VaRStrategy implements RiskAlgorithm {
    @Override
    public String calculate(FinancialContext context) {
        double var = context.getPortfolioValue() * context.getVolatility() * 2.33; // 99% VaR (simulado)
        String result = String.format("Value at Risk (VaR): Risco de perda de R$ %.2f", var);
        System.out.println("LOG: Executando cálculo VaR com contexto: " + context);
        return result;
    }
}