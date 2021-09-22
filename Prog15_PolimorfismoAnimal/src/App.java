public class App {
    public static void main(String[] args) throws Exception {
        Gato gato1 = new Gato("Clóvis Roberto", 5, "preto");
        Cachorro cachorro1 = new Cachorro("Alfredo", 4, "Doberman");

        System.out.println(gato1.emitirSom());
        System.out.println(cachorro1.emitirSom());
    }
}
