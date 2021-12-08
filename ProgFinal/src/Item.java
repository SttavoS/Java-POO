import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javax.management.RuntimeErrorException;

public class Item {
    private String nome;
    private double preco;

    public Item(String nome, double preco) {
        this.nome = nome.trim();
        this.preco = preco;
    }

    public void validar() {
        if (this.nome.length() < 3) {
            throw new RuntimeException("O nome do produto não pode ter menos de 3 caracteres.");
        }

        if (this.preco < 0) {
            throw new RuntimeException("O produto não pode ter o preço menor do que zero.");
        }
    }
    
    public String getPrecoFormatado() {
        return NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(this.preco); 
    }

    public String getInfo() {        
        return MessageFormat.format("{0} | {1}", this.nome, this.getPrecoFormatado());
    } 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }    
}
