public class Show extends Ingresso {
    private String nome;

    public Show(String nome, double valor, String data, String cadeira) {
        super(valor, data, cadeira);
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}
