import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int lado1, lado2, lado3;

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor do primeiro lado: ");
        lado1 = leitor.nextInt();

        System.out.println("Digite o valor do segundo lado: ");
        lado2 = leitor.nextInt();

        System.out.println("Digite o valor do terceiro lado: ");
        lado3 = leitor.nextInt();

        leitor.close();

        boolean trianguloEquilatero = (lado1 == lado2 && lado2 == lado3 && lado1 == lado3);
        boolean trianguloIsoseles = (lado1 == lado2 || lado2 == lado3 || lado1 == lado3);
        boolean trianguloEscaleno = (lado1 != lado2 && lado2 != lado3 && lado1 != lado3);

        if (trianguloEquilatero) {
            System.out.println("O triangulo é eqüilátero");
        }

        if (trianguloIsoseles) {
            System.out.println("O triangulo é isósceles");
        }

        if (trianguloEscaleno) {
            System.out.println("O triangulo é escaleno");
        }
    }
}
