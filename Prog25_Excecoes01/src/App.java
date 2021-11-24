public class App {
    public static void main(String[] args) throws Exception {
        double valorTotal = 2000.0;
        double entrada = 200.0;
        int parcelas = 10;
        
        if (entrada < valorTotal * 0.3) {
            System.out.println("Entrade de, no mínimo, 30% do valor total");
        } else if (parcelas < 8) {
            System.out.println("O número mínimo de parcelas é 8");
        } else {
            Financiamento fin = new Financiamento(valorTotal, entrada, parcelas);
            System.out.println(fin.prestacao());
        }        
    }
}
