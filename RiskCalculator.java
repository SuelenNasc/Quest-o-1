public class RiskCalculator {
    private RiskAlgorithm algorithm;
    private FinancialContext context;

    public RiskCalculator(FinancialContext context) {
        this.context = context;
        this.algorithm = new VaRStrategy(); 
        System.out.println("RiskCalculator iniciado com o contexto: " + context);
    }

    public void setAlgorithm(RiskAlgorithm algorithm) {
        System.out.println("\n[SISTEMA] Trocando algoritmo para: " + algorithm.getClass().getSimpleName());
        this.algorithm = algorithm;
    }

    public String calculateRisk() {
        if (this.algorithm == null) {
            return "Erro: Nenhum algoritmo de risco foi configurado.";
        }
        return this.algorithm.calculate(this.context);
    }
}