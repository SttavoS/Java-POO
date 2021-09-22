public abstract class Conta {
    protected String nome;
    protected String numero;
    protected double limite;
    protected double saldo;

    public Conta(String nome, String numero) {
        this.nome = nome.trim();
        this.numero = numero.trim();
    }

    public abstract void deposita(double quantitade);

    public abstract void retirar(double quantitade);

    protected double getSaldo() {
        return this.saldo;
    }
}
