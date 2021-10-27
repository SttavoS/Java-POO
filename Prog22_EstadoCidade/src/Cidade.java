import java.text.MessageFormat;

public class Cidade {
    public String nome;
    public int populacao;
    public double idh;

    public Cidade(String nome, int populacao, double idh) {
        this.nome = nome;
        this.populacao = populacao;
        this.idh = idh;
    }

    public String getInfo() {        
        return MessageFormat.format("{0} | {1} mil | {2}", this.nome, this.populacao, this.idh);
    } 
}
