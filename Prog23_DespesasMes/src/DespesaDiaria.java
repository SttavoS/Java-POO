public class DespesaDiaria {
    protected double valor;
    
    public DespesaDiaria() {
        this.valor = Math.floor(Math.random() * 100);

        System.out.println("O valor gasto diário é de R$ " + this.valor);
    }
}
