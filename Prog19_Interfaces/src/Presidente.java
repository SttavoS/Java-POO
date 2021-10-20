public class Presidente extends Funcionario {
    
    public Presidente(String nome, double salario) {
        this.nome = nome.trim();
        this.salario = this.setSalario(salario);
    }

    @Override
    public double setSalario(double valor) {
        return this.salario = valor * 1.80;
    }
}
