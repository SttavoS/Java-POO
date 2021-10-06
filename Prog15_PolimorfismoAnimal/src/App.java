public class App {
    public static void main(String[] args) throws Exception {
        Gato gato1 = new Gato("Clóvis Roberto", 5, "preto");
        Cachorro cachorro1 = new Cachorro("Alfredo", 4, "Doberman");

        System.out.println(gato1.emitirSom());
        System.out.println(cachorro1.emitirSom());
        System.out.println("----------------");
        System.out.println("A raça do gato é " + gato1.getRaca());
        System.out.println("A raça do cachorro é " + cachorro1.getRaca());

        gato1.morreu();
        cachorro1.morreu();

        System.out.println(cachorro1.getStatus() ? "cachorro vivo" : "cachorro morto");
    }
}
