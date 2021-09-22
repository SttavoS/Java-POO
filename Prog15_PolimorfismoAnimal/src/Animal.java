public class Animal {
    private String nome;
    private int idade;
    protected boolean status;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.status = true;
    }
    
    public String emitirSom() {
        return "...";
    }

    public String getRaca() {
        return "...";
    }

    public boolean getStatus() {
        return this.status;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void morreu() {
        this.status = false;
    }
}
