public class App {
    public static void main(String[] args) throws Exception {
        Cinema filme = new Cinema("Blade Runner", 25.00, "12/10/2021", "3H");
        Futebol futebol = new Futebol("Inter", "Grêmio", "amistoso", 250.00, "20/10/2021", "22J");
        Teatro teatro = new Teatro("Don Quixote", 95.00, "15/11/2021", "13G");
        Show show = new Show("Show do Metallica", 650.00, "12/12/2021", "47F");

        System.out.println("Filme: " + filme.getNome() + " - " + filme.imprimeValor() + " - " + filme.getData());
        System.out.println("Jogo: " + futebol.exibeConfronto() + " - " + futebol.imprimeValor() + " - " + futebol.getData());
        System.out.println("Teatro: " + teatro.getNome() + " - " + teatro.imprimeValor() + " - " + teatro.getData());
        System.out.println("Show: " + show.getNome() + " - " + show.imprimeValor() + " - " + show.getData());
    }
}
