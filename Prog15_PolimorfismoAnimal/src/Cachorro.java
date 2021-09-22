public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return "Au Au";
    }

    @Override
    public String getRaca() {
        return this.raca;
    }
}
