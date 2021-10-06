public class Novo extends Imovel {
    private double taxa;

    public Novo(String endereco, double preco, int comodosQtde) {
        super(endereco, preco, comodosQtde);
        this.taxa = 25.0;
    }

    public double getTaxa() {
        return taxa;
    }
}
