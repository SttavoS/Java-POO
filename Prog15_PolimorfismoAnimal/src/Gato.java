public class Gato extends Animal {
    private String corDoPelo;
    private int vidas = 7;

    public Gato(String nome, int idade, String corDoPelo) {
        super(nome, idade);
        this.corDoPelo = corDoPelo;
    }

    @Override
    public String emitirSom() {
        return "Miau";
    }

    @Override
    public String getRaca() {
        return this.corDoPelo;
    }

    @Override
    public void morreu() {
        if (vidas > 0) {
            vidas--;
        }

        this.status = false;
    }
}
