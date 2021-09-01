public class Estagiario extends Funcionario {
    private Double bolsaAuxilio;

    public Estagiario(String nome, String endereco, Double bolsaAuxilio) {
        super(nome, endereco);
        this.bolsaAuxilio = bolsaAuxilio;
    }

    public Double getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public void setBolsaAuxilio(Double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }

    public void exibirDados() {
        System.out.println("O(A) Estagiário " + this.nome + " recebe R$" + this.bolsaAuxilio + " e mora na " + this.endereco);
    }
}
