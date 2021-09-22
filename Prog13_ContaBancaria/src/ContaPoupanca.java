public class ContaPoupanca extends Conta {

    public ContaPoupanca(String nome, String numero) {
        super(nome, numero);
        this.limite = 300;
        this.saldo = 0;
    }

    @Override
    public void deposita(double quantitade) {
        this.saldo += quantitade * 1.1;
    }

    @Override
    public void retirar(double quantitade) throws IllegalArgumentException {
        if (quantitade <= this.limite) {
            this.saldo -= quantitade;
        }
        else throw new IllegalArgumentException("estourou limite!");       
    }
}