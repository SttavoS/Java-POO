public class Instrumento {
    protected String nome;
    protected String tipo;
    protected String cor;

    public Instrumento(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public void emitirSom() {
        System.out.println("eu não sei");
    }
}
