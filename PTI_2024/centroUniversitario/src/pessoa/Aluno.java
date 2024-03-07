package pessoa;

public class Aluno extends PessoaFisica {

    private int matricula;
    private String curso;
    private int ano;

    public Aluno(int id, String nome, String endereco, String contato, int matricula, String curso, int ano) {
        super(nome, endereco, contato);
        this.matricula = matricula;
        this.curso = curso;
        this.ano = ano;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public static void cadastrarAluno(int matricula, String curso, int anoIngresso) {
        Aluno aluno = new Aluno(1, "NomeAluno", "EnderecoAluno",
         "ContatoAluno", matricula, curso, anoIngresso);

    }
}