import java.text.NumberFormat;
import java.util.Locale;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    protected abstract double setSalario(double valor);

    public String getSalario() {
        return NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(this.salario);
    }

    public String getNome() {
        return this.nome;
    }
}
