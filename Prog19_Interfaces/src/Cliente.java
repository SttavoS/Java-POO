public class Cliente implements Autenticavel { 
    public String nome;
    public String cpf;
    public final int senha = 123456;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public boolean autenticar(int senha) {
        if (senha != this.senha) {            
            return false;
        }

        return true;
    }    
}
