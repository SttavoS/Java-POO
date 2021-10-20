public class Gerente extends Funcionario implements Autenticavel {
    public final int senha = 123;

    public Gerente(String nome, double salario) {
        this.nome = nome.trim();
        this.salario = this.setSalario(salario);
    }

    @Override
    public double setSalario(double valor) {
        return this.salario = valor * 1.20;
    }

    @Override
    public boolean autenticar(int senha) {
        if (senha != this.senha) {            
            return false;
        }

        return true;
    }    
}
