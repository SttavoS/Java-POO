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
        
		for(int j = 0; j < vetor.length; j++){
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
        } else if (ordem == -1) {
            System.out.println("O vetor não está ordenado!");
        }
    }

    /**
     * Verifica se o vetor está em ordem crescente ou decrescente
     * @param vetor Vetor a ser verificado
     * @return 1 se estiver em ordem crescente, 0 se estiver em ordem decrescente, -1 se não estiver ordenado
     */
    private static int verificaOrdem(int vetor[]) {
        boolean ordem = true;
        
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                ordem = false;
                break;
            }
        }

        if (ordem) {
            return 1;
        } else {
            ordem = true;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] < vetor[i + 1]) {
                    ordem = false;
                    break;
                }
            }

            if (ordem) {
                return 0;
            } else {
                return -1;
            }
        }
    }
}
