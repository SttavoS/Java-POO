import java.text.NumberFormat;
import java.util.Locale;

public class Ingresso {
    protected double valor;
    protected String data;
    protected String cadeira;

    public Ingresso(double valor, String data, String cadeira) {
        this.valor = valor;
        this.data = data;
        this.cadeira = cadeira;
    }

    protected String imprimeValor() {
        return NumberFormat.getCurrencyInstance(new Locale ("pt", "BR")).format(this.valor);
    }

    protected String getData() {
        return this.data;
    }
}
