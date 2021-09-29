public class InstrumentoCorda extends Instrumento {
    private int cordas;

    public InstrumentoCorda(String nome, String cor, int cordas) {
        super(nome, cor);
        this.tipo = "corda";
        this.cordas = cordas;
    }

    public String getCordas() {
        return this.cordas + " cordas";
    }

    public void emitirSom() {
        System.out.println("Tam Tam Tam");
    }
}
