public class Financiamento {
    public double valorTotal, entrada;
    public int parcelas;

    public Financiamento(double valorTotal, double entrada, int parcelas) {
        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }

    public double prestacao() {
        return (valorTotal - entrada) / parcelas;
    }
}
