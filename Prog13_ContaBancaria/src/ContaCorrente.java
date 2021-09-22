public class ContaCorrente extends Conta {

    public ContaCorrente(String nome, String numero) {
        super(nome, numero);
        this.limite = 750;
        this.saldo = 0;
    }

    @Override
    public void deposita(double quantitade) {
        this.saldo += quantitade;
    }

    @Override
    public void retirar(double quantitade) throws IllegalArgumentException {
        if (quantitade <= this.limite) {
            this.saldo -= quantitade;
            this.saldo -= 5;
        }
        else throw new IllegalArgumentException("estourou limite!");       
    }
}
