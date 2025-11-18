public class StressTestingStrategy implements RiskAlgorithm {
    @Override
    public String calculate(FinancialContext context) {
        double loss = context.getPortfolioValue() * 0.45; // Simula cenário de crise (ex: 2008)
        String result = String.format("Stress Test: Perda de R$ %.2f no cenário de crise", loss);
        System.out.println("LOG: Executando Stress Test simulando colapso de mercado...");
        return result;
    }
}