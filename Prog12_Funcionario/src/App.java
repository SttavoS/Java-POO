import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        listaFuncionario.add(new Efetivo("João", "Rua dos Bobos", 1250.00));
        listaFuncionario.add(new Efetivo("Maria", "Rua dos Bobos", 1200.00));
        listaFuncionario.add(new Estagiario("Joãozinho", "Rua dos Bobos", 500.00));
        listaFuncionario.add(new Estagiario("Mariazinha", "Rua dos Bobos", 450.00));

        listaFuncionario.forEach(Funcionario::exibirDados);
    }
}
