import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = "";
        String disciplinaInput = "";
        float[] notas = new float[4];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        nome = scanner.nextLine();

        System.out.println("Digite o nome da disciplina: ");
        disciplinaInput = scanner.nextLine();

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digie a nota " + i +  ": ");
            notas[i] = scanner.nextFloat();            
        }

        scanner.close();

        Aluno aluno = new Aluno(nome);
        Disciplina disciplina = new Disciplina(disciplinaInput ,aluno, notas);
        aluno.setDisciplina(disciplina);

        System.out.println("O aluno " + aluno.getNome() + " na disciplina de" + aluno.getDisciplina().getNome() +  " foi " + aluno.getDisciplina().getSituacao() + " com média de " + aluno.getDisciplina().getMedia());
    }
}
