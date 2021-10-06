public class Imovel {
    protected String endereco;
    protected double preco;
    protected int comodosQtde;

    public Imovel(String endereco, double preco, int comodosQtde) {
        this.endereco = endereco;    
        this.preco = preco;    
        this.comodosQtde = comodosQtde;    
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getComodosQtde() {
        return comodosQtde;
    }

    public void setComodosQtde(int comodosQtde) {
        this.comodosQtde = comodosQtde;
    }
}
