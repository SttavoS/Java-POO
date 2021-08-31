import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String ultimaString = "";
        String stringAtual = "";
        int stringsCount = 0;
        String maiorStringLida = "";
        String stringConCat = "";

        do {
            System.out.print("\nDigite a String: ");
            stringAtual = scanner.nextLine();

            stringsCount++;

            if (ultimaString.equals(stringAtual)) {
                break;
            }

            if (stringAtual.length() > ultimaString.length()) {
                maiorStringLida = stringAtual;
            }
            ultimaString = stringAtual;
            stringConCat = stringConCat.concat(stringAtual);   
                   
        } while(ultimaString.equals(stringAtual));

        scanner.close();

        System.out.println("Número de Strings lidas: " + stringsCount);
        System.out.println("Maior String lida: " + maiorStringLida.length());
        System.out.println("A concatenação das Strings lida é: " + stringConCat);
    }
}
