import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor;
        vetor = new int[10];
        int numX;
        int maioresQueX = 0, menoresQueX = 0, iguaisQueX = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número do vetor na posição " + (i+1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("\nNúmero X: ");
        numX = scanner.nextInt();

        scanner.close();
        
		for(int j = 0; j < 10; j++){
			if (vetor[j] > numX) {
				maioresQueX++;
			} else if(vetor[j] == numX){
				iguaisQueX++;
			} else {
				menoresQueX++;
			}
		}
        
		System.out.println("\nMaiores que " + numX + ": "+ maioresQueX);
		System.out.println("Menores que " + numX + ": "+ menoresQueX);
		System.out.println("Iguais a " + numX + ": "+ iguaisQueX);

        int ordem = verificaOrdem(vetor);

        if (ordem == 1) {
            System.out.println("O vetor está em ordem crescente!");
        } else if (ordem == 0) {
            System.out.println("O vetor está em ordem decrescente!");
        } else {
            System.out.println("O vetor não está ordenado!");
        }
    }

    private static int verificaOrdem(int vetor[]) {
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i - 1] > vetor[i]) {
                return 0;
            }
        }
        return 1;
    }
}
