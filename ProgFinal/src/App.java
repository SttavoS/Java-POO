import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String produtoNome = "";
        double produtoPreco = 0;
        int qtdeDeProdutos = 0;

        try {
            System.out.println("Quantos produtos quer comprar? ");
            qtdeDeProdutos = Integer.parseInt(scan.nextLine());

            Item[] produtos = new Item[qtdeDeProdutos];

            for (int i = 0; i < qtdeDeProdutos; i++) {
                System.out.println("Nome do produto " + (i + 1) + ":");
                produtoNome = scan.nextLine();
                System.out.println("Valor do produto " + (i + 1) + ":");
                produtoPreco = Integer.parseInt(scan.nextLine());

                Item item = new Item(produtoNome, produtoPreco);
                item.validar();
                produtos[i] = item;

                System.out.println("===========");
            }

            scan.close();

            Carrinho carrinho = new Carrinho(produtos);

            System.out.println(carrinho.obterInfo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
