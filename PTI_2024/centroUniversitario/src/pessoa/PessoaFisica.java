package pessoa;

public class PessoaFisica {
    private static int nextId = 1;
    public int id;
    public String nome;
    public String endereco;
    public String contato;

    public PessoaFisica(String nome, String endereco, String contato) {
        this.id = nextId ++;
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void adicionar() {

    }

    public String toString() {
        return "Id: " + id + ", Nome: " + nome + ", Endereço: " + endereco + ", Contato: " + contato;
    }
}
