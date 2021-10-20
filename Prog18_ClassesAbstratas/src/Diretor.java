public class Diretor extends Funcionario {
    
    public Diretor(String nome, double salario) {
        this.nome = nome.trim();
        this.salario = this.setSalario(salario);
    }

    @Override
    public double setSalario(double valor) {
        return this.salario = valor * 1.40;
    }
}
