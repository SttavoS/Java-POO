public class Disciplina {
    private Aluno aluno;
    private String nome;
    private float[] notas;
    private float media;
    private String situacao;

    public Disciplina(String nome,Aluno aluno,float[] notas) {
        this.nome = nome.trim();
        this.aluno = aluno;
        this.notas = notas;
        this.media = calcularMedia(this.notas);
        this.situacao = this.setSituacao();
    }

    private float calcularMedia(float[] notas) {
        return (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
    }

    public String getSituacao() {
        return situacao;
    }

    private String setSituacao() {
        if (this.media >= 7) {
            return this.situacao = "Aprovado";        
        }

        return this.situacao = "Reprovado";
    }
    
    public String getNome() {
        return this.nome;
    }

    public Aluno getAluno() {
        return this.aluno;
    }

    public float getMedia() {
        return this.media;
    }
}
