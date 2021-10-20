public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        this.nome = nome.trim();
        this.salario = this.setSalario(salario);
    }

    @Override
    public double setSalario(double valor) {
        return this.salario = valor * 1.20;
    }
}
