public class Diretor extends Funcionario implements Autenticavel {
    public final int senha = 1234;

    public Diretor(String nome, double salario) {
        this.nome = nome.trim();
        this.salario = this.setSalario(salario);
    }

    @Override
    public double setSalario(double valor) {
        return this.salario = valor * 1.40;
    }

    @Override
    public boolean autenticar(int senha) {
        if (senha != this.senha) {            
            return false;
        }

        return true;
    } 
}
