public class InstrumentoSopro extends Instrumento {
    private int furos;

    public InstrumentoSopro(String nome, String cor, int furos) {
        super(nome, cor);
        this.tipo = "sopro";
        this.furos = furos;
    }

    public void emitirSom() {
        System.out.println("Dum Dum Dum");
    }

    public String getFuros() {
        return this.furos + " furos";
    }
}
