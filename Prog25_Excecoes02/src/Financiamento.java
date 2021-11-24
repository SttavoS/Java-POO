public class Financiamento {
    public double valorTotal, entrada;
    public int parcelas;

    public Financiamento(double valorTotal, double entrada, int parcelas) {
        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }

    public void validar() {
        if (entrada < valorTotal * 0.3) {
            throw new RuntimeException("Entrade de no mínimo 30% do valor total");
        }
        
        if (parcelas < 8) {
            throw new RuntimeException("O número mínimo de parcelas é 8");
        } 
    }

    public double prestacao() {
        return (valorTotal - entrada) / parcelas;
    }
}
