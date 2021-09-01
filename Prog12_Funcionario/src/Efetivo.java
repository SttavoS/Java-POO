public class Efetivo extends Funcionario {
    private Double salario;

    public Efetivo(String nome, String endereco, Double salario) {
        super(nome, endereco);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void exibirDados() {
        System.out.println("O(A) Efetivo " + this.nome + " recebe R$" + this.salario + " e mora na " + this.endereco);
    }
}
