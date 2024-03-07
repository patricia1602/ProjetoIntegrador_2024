package pessoa;

public class Fornecedor extends PessoaFisica {

    private String cnapj;
    private String servico;

    public Fornecedor(int id, String nome, String endereco, String contato, String cnapj, String servico) {
        super(nome, endereco, contato);
        this.cnapj = cnapj;
        this.servico = servico;
    }

    public String getCnapj() {
        return cnapj;
    }

    public void setCnapj(String cnapj) {
        this.cnapj = cnapj;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public static void cadastrarFornecedor(String cnpj, String servicosFornecidos) {
        Fornecedor fornecedor = new Fornecedor(1, "NomeFornecedor", "EnderecoFornecedor",
         "ContatoFornecedor", cnpj,
                servicosFornecidos);

    }
}