public class Usado extends Imovel {
    private String consertos;
     
    public Usado(String endereco, double preco, int comodosQtde, String consertos) {
        super(endereco, preco, comodosQtde);
        this.consertos = consertos;
    }

    public String getConsertos() {
        return consertos;
    }

    public void setConsertos(String consertos) {
        this.consertos = consertos;
    }
}
