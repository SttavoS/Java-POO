public abstract class Conta {
    protected String nome;
    protected String endereco;
    protected String numero;
    protected double limite;
    protected double saldo;

    public Conta(String nome, String endereco, String numero) {
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
    }

    public abstract void deposita(double quantitade);

    public abstract void retirar(double quantitade);

    protected double getSaldo() {
        return this.saldo;
    }
}
