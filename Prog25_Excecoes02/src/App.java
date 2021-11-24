public class App {
    public static void main(String[] args) throws Exception {
        double valorTotal = 2000.0;
        double entrada = 200.0;
        int parcelas = 10;
        
        try {
            Financiamento fin = new Financiamento(valorTotal, entrada, parcelas);
            fin.validar();
            System.out.println(fin.prestacao());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }        
    }
}
