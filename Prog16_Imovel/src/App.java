import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Novo aaaaaa = new Novo("Rua dos ricos", 1000000, 15);
        Usado bbbbbb = new Usado("Rua dos pobres", 100000, 4, "tudo");
        Novo cccccc = new Novo("Rua dos hispters", 250000, 1);  
        Usado dddddd = new Usado("Rua dos nem tão pobres", 25000, 1, "tudo");

        ArrayList<Imovel> imoveis = new ArrayList<>();
        imoveis.add(aaaaaa);
        imoveis.add(bbbbbb);
        imoveis.add(cccccc);
        imoveis.add(dddddd);

        imoveis.forEach(imovel -> {
            System.out.println(imovel.getEndereco());
            System.out.println(imovel.getPreco());
            System.out.println(imovel.getComodosQtde());
        });
    }
}
