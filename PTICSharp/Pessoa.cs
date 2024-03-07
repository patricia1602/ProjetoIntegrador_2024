using System;

namespace PTICSharp
{

    public class Pessoa
    {

        public int id { get; set;}
        public string nome { get; set;}
        public string endereco { get; set;}
        public string contato { get; set;}

    }

    //Classe aluno
    public class Aluno : Pessoa
    {

        public int matricula { get; set;}
        public string curso { get; set;}

        public int ano { get; set;}

    }

    //Classe professor
    public class Professor : Pessoa
    {
        public int registro { get; set;}
        public string[] disciplina { get; set;}

    }

    //Classe fornecedor
    public class Fornecedor : Pessoa
    {
        public string cnpj { get; set;}
        public string servico { get; set;}

    }

    //Interface pessoa juridica
    public interface PessoaJuridica
    {
        public string cnpj { get; set;}
        public string razaoSocial { get; set;}

    }

    public class PessoaFisicaCadastro
    {

        public static void Main()
        {
            if (VerificarPermissaoCadastro())
            {

                Console.WriteLine("1. O usuário seleciona a opção de cadastro de Pessoa Física.");
                Console.WriteLine("2. O sistema exibe o formulário de cadastro com campos necessários.");

                string nome = "Manuela";
                string endereco = "Rua das Flores, 123";
                string contato = "manuela@gmail.com";

                Console.WriteLine("3. O usuário preenche os campos obrigatórios.");
                Console.WriteLine($"Nome: {nome}, Endereço: {endereco}, Contato: {contato}");

                if (ValidarDados(nome, endereco, contato))
                {
                    CadastrarPessoaFisica(nome, endereco, contato);

                    Console.WriteLine("4. O sistema valida os dados e cadastra a Pessoa Física.");
                    Console.WriteLine("5. O sistema exibe uma mensagem de sucesso.");
                }
                else
                {
                    Console.WriteLine("4. O sistema exibe uma mensagem de erro e solicita correção.");
                }
            }
            else
            {
                Console.WriteLine("Usuário não tem permissão para cadastrar pessoas físicas.");
            }
        }
        private static bool VerificarPermissaoCadastro()
        {
            return true;
        }

        private static bool ValidarDados(string nome, string endereco, string contato)
        {
            return !string.IsNullOrEmpty(nome) && !string.IsNullOrEmpty(endereco) && !string.IsNullOrEmpty(contato);
        }

        private static void CadastrarPessoaFisica(string nome, string endereco, string contato)
        {

            Console.WriteLine($"Pessoa Física cadastrada: Nome: {nome}, Endereço: {endereco}, Contato: {contato}");
        }
    }
}
