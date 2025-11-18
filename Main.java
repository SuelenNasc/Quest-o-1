public class Main {
    public static void main(String[] args) {
        
        FinancialContext context = new FinancialContext(1_000_000.00, 0.15, 0.05, 30);
        RiskCalculator calculator = new RiskCalculator(context);

        System.out.println("\n--- Cálculo Padrão ---");
        String result1 = calculator.calculateRisk();
        System.out.println("Resultado: " + result1);

        calculator.setAlgorithm(new StressTestingStrategy());

        System.out.println("\n--- Cálculo de Stress Test ---");
        String result2 = calculator.calculateRisk();
        System.out.println("Resultado: " + result2);
        
        calculator.setAlgorithm(new ExpectedShortfallStrategy());
        
        System.out.println("\n--- Cálculo de Expected Shortfall ---");
        String result3 = calculator.calculateRisk();
        System.out.println("Resultado: " + result3);
    }
}