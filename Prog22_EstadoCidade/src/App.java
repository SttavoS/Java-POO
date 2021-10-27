import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nomeEstadoEntr, siglaEstadoEntr;

        System.out.println("Digite o nome do estado: ");
        nomeEstadoEntr = scanner.nextLine();
        System.out.println("Digite a sigla do estado: ");
        siglaEstadoEntr = scanner.nextLine();

        Estado estado = new Estado(nomeEstadoEntr, siglaEstadoEntr);

        Cidade[] cidades = new Cidade[3];
        for (int i = 0; i < cidades.length; i++) {
            System.out.println("Infos da cidade " + (i+1));

            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a populacao: ");
            int populacao = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite o idh: ");
            Double idh = Double.parseDouble(scanner.nextLine());

            Cidade c = new Cidade(nome, populacao, idh);
            cidades[i] = c;

            System.out.println("===========");
        }

        scanner.close();
        estado.setCidades(cidades);        

        System.out.println(estado.obterInfo());
    }
}
