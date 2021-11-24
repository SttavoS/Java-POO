import java.text.NumberFormat;
import java.util.Locale;

public class Produto {
    public String nome;
    public double valor;
    public int estoque;

    public Produto(String nome, double valor, int estoque) {
        if (nome.length() < 2) {
            throw new RuntimeException("O nome do produto precisa ter no mínimo 2 caracteres");
        }

        if (valor < 0) {
            throw new RuntimeException("O valor do produto não pode ser menor do que zero");
        }

        if (estoque < 1) {
            throw new RuntimeException("O estoque não pode ser menor que 1");
        }

        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }

    public String getValorEmReais() {
        return NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(this.valor);
    }
}
