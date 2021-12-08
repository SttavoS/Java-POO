import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Carrinho {
    private Item[] itens;
    private double total;

    public Carrinho(Item[] itens) {
        this.itens = itens;
        this.total = 0;
    }

    public double calcularTotal() {
        double total = 0;
        
        for (Item item : itens) {
            total += item.getPreco();
        }

        return total;
    }

    public String getValorTotalFormatado() {
        return NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(this.calcularTotal()); 
    }

    public String obterInfo() throws Exception {
        if (this.itens == null) {
            throw new Exception("Não há nenhum item no carrinho.");
        }
        String info = MessageFormat.format("Total no carrinho: {0}\n", this.getValorTotalFormatado());
        
        for (Item item : itens) {
            info += item.getInfo() + "\n";
        }

        return info;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
