import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float nota1, nota2, nota3, nota4, mediaFinal;

        System.out.print("Entre com a nota do primeiro bimestre: "); 
        nota1 = leitor.nextFloat();

        System.out.print("Entre com a nota do segundo bimestre: ");
        nota2 = leitor.nextFloat();

        System.out.print("Entre com a nota do terceiro bimestre: ");
        nota3 = leitor.nextFloat();

        System.out.print("Entre com a nota do quarto bimestre: ");
        nota4 = leitor.nextFloat();

        leitor.close();

        mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;        
        
        if(mediaFinal >= 7) {
            System.out.print("Voce foi APROVADO. ");
        } else {
            System.out.print("Voce foi REPROVADO. ");
        }

        System.out.print("A media final é de: " + mediaFinal + " pontos.");
    }    
}