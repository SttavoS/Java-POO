import java.text.MessageFormat;

public class Contato {
    private String nome;
    private String email;
    private String telefone;

    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
    public String getInfo() {        
        return MessageFormat.format("{0} | {1} | {2}", this.nome, this.email, this.telefone);
    } 
}
