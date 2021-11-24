public class App {
    public static void main(String[] args) throws Exception {
        String nome = "O Hobbit";
        double valor = 30.0;    
        int quantidade = 3000;

        try {
            Produto livro = new Produto(nome, valor, quantidade);
            System.out.println(livro.nome + " | " +livro.getValorEmReais());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
