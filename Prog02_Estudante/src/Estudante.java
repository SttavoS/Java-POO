import java.util.Scanner;

public class Estudante {
    private String nome;
    private Integer idade;
    private String curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do estudante: ");
        String nomeEntrada = leitor.nextLine();

        System.out.println("Digite a idade do estudante: ");
        Integer idadeEntrada = leitor.nextInt();

        System.out.println("Digite o curso do estudante: ");
        String cursoEntrada = leitor.next();

        Estudante estudante = new Estudante();
        estudante.setNome(nomeEntrada);
        estudante.setIdade(idadeEntrada);
        estudante.setCurso(cursoEntrada);

        System.out.println("O estudante se chama "+ estudante.getNome() + ", tem "+estudante.getIdade()+" anos e cursa "+estudante.getCurso()+"!");
    }
}
