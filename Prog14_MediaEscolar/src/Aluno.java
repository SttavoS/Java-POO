public class Aluno {
    private String nome;
    private Disciplina disciplina;

    public Aluno(String nome) {
        this.nome = nome.trim();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.trim();
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Disciplina getDisciplina() {
        return this.disciplina;
    }
}