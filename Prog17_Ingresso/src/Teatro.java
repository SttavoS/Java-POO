public class Teatro extends Ingresso {
    private String nome;

    public Teatro(String nome, double valor, String data, String cadeira) {
        super(valor, data, cadeira);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
