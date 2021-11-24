public class DespesaMes extends DespesaDiaria {
    private double mes;
    private double anual;

    public DespesaMes() {
        this.mes = this.valor * 30;
        System.out.println("O valor gasto mensalmente é de R$ " + this.mes);

        this.anual = this.valor * 365;
        System.out.println("O valor gasto anualmente é de R$ " + this.anual);
    }
}
