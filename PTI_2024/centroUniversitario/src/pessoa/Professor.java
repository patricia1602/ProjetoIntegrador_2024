package pessoa;

public class Professor extends PessoaFisica {

    private int registro;
    private String disciplina;

    public Professor(int id, String nome, String endereco, String contato) {
        super(nome, endereco, contato);
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public static void cadastrarProfessor(int registro, String[] disciplina) {
        Professor professor = new Professor(1, null, null, null);

    }
}