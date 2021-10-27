import java.text.MessageFormat;

public class Estado {
    public String nome;
    public String sigla;
    public Cidade[] cidades;

    public Estado(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public Cidade[] getCidades() {
        return cidades;
    }

    public void setCidades(Cidade[] cidades) {
        this.cidades = cidades;
    }
    
    public String obterInfo() throws Exception {
        if (this.cidades == null) {
            throw new Exception("A lista de cidades está vazia.");
        }
        String info = MessageFormat.format("{0} | {1}\n", this.sigla, this.nome);
        
        for (Cidade cidade : cidades) {
            info += cidade.getInfo() + "\n";
        }

        return info;
    }
}
