public class App {
    public static void main(String[] args) throws Exception {
        
        Gerente gerente = new Gerente("fulano", 10000.0);
        Diretor diretor = new Diretor("ciclano    ", 10000.0);
        Cliente cliente = new Cliente("Beltrano", "000.000.000-00");
        
        System.out.println("Autenticado: " + gerente.autenticar(1234));
        System.out.println("Autenticado: " + diretor.autenticar(1234));
        System.out.println("Autenticado: " + cliente.autenticar(4321));
    }
}
