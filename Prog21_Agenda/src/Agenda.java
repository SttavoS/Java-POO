import java.text.MessageFormat;

public class Agenda {
    public String nome;
    public Contato[] contatos;

    public Agenda(String nome, Contato[] contatos) {
        this.nome = nome;
        this.contatos = contatos;
    }

    public String obterInfo() throws Exception {
        if (contatos == null) {
            throw new Exception("A lista de contatos está vazia.");
        }
        String info = MessageFormat.format("Nome da agenda: {0}\n", this.nome);
        
        for (Contato contato : contatos) {
            info += contato.getInfo() + "\n";
        }

        return info;
    }
}
