import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nomeAgendaEntr;

        System.out.println("Digite o nome da agenda: ");
        nomeAgendaEntr = scanner.nextLine();

        Contato[] contatos = new Contato[3];
        for (int i = 0; i < contatos.length; i++) {
            System.out.println("Infos do contato " + (i+1));
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o email: ");
            String email = scanner.nextLine();
            System.out.print("Digite o telefone: ");
            String telefone = scanner.nextLine();
            Contato c = new Contato(nome, email, telefone);

            contatos[i] = c;
            System.out.println("===========");
        }

        scanner.close();

        Agenda agenda = new Agenda(nomeAgendaEntr, contatos);

        System.out.println(agenda.obterInfo());
    }
}
