public class App {
    public static void main(String[] args) throws Exception {
        InstrumentoCorda guitarra = new InstrumentoCorda("Les Paul", "Vermelho", 6);
        InstrumentoCorda contraBaixo = new InstrumentoCorda("Fender", "Amarelo", 4);
        InstrumentoSopro flauta = new InstrumentoSopro("Flauta", "Branca", 10);
        InstrumentoSopro saxofone = new InstrumentoSopro("Yamaha", "Dourado", 26);

        System.out.println("--- Instrumento de Corda ---");
        System.out.println("Nome: " + guitarra.getNome());
        System.out.println("Cor: " + guitarra.getCor());
        System.out.println("Cordas: " + guitarra.getCordas());
        guitarra.emitirSom();
        System.out.println("---");
        System.out.println("Nome: " + contraBaixo.getNome());
        System.out.println("Cor: " + contraBaixo.getCor());
        System.out.println("Cordas: " + contraBaixo.getCordas());
        contraBaixo.emitirSom();
        System.out.println("--- Instrumento de Sopro ---");
        System.out.println("Nome: " + flauta.getNome());
        System.out.println("Cor: " + flauta.getCor());
        System.out.println("Furos: " + flauta.getFuros());
        flauta.emitirSom();
        System.out.println("---");
        System.out.println("Nome: " + saxofone.getNome());
        System.out.println("Cor: " + saxofone.getCor());
        System.out.println("Furos: " + saxofone.getFuros());
        saxofone.emitirSom();
    }
}
