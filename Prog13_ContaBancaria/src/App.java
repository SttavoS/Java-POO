public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente cr = new ContaCorrente("João","5555");
        ContaPoupanca cp = new ContaPoupanca("Maria", "3333");

        System.out.println("CONTA CORRENTE");
        System.out.println("===========================");
        System.out.println("Saldo atual: " + cr.getSaldo());
        cr.deposita(2500);
        System.out.println("Saldo atual: " + cr.getSaldo());
        cr.retirar(600);
        System.out.println("Saldo atual: " + cr.getSaldo());

        System.out.println("===========================");

        System.out.println("CONTA POUPANÇA");
        System.out.println("===========================");
        System.out.println("Saldo atual: " + cp.getSaldo());
        cp.deposita(5000);
        System.out.println("Saldo atual: " + cp.getSaldo());
        cp.retirar(250);
        System.out.println("Saldo atual: " + cp.getSaldo());
    }
}
