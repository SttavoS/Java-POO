public class App {
    public static void main(String[] args) throws Exception {
        
        Gerente gerente = new Gerente("fulano", 10000.0);
        Diretor diretor = new Diretor("ciclano    ", 10000.0);
        Presidente presidente = new Presidente("Beltrano", 10000.0);
        
        System.out.println("O salário do gerente " + gerente.getNome() + " é " + gerente.getSalario());
        System.out.println("O salário do diretor " + diretor.getNome() + " é " + diretor.getSalario());
        System.out.println("O salário do presidente " + presidente.getNome() + " é " + presidente.getSalario());
    }
}
