import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int code;
        int quantity;
        double price = 0, totalPrice = 0;
        Scanner scanner = new Scanner(System.in);
        boolean error = false;

        System.out.println("Digite o código do produto: ");
        code = scanner.nextInt();

        System.out.println("Digite a quantidade comprada do produto: ");
        quantity = scanner.nextInt();

        scanner.close();

        switch (code) {
            case 1000:
                price = 5.60;
                break;
            case 1001:
                price = 8.90;
                break;
            case 2000:
                price = 15.55;
                break;
            case 2001:
                price = 20.69;
                break;        
            default:
                error = true;
                break;
        }

        if (!error == true) {    
            totalPrice = price * quantity;
            System.out.println("O preço total é de: " + totalPrice);    
        } else {
            System.out.println("Código Inválido!");
        }
    }
}
