package cadastro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import pessoa.PessoaFisica;

public class CadastroPessoaFisica {

    private static List<PessoaFisica> pessoasCadastradas = new ArrayList<>();
    private static int id;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar Pessoa Física");
            System.out.println("2. Listar Pessoas Cadastradas");
            System.out.println("3. Apagar Pessoa Física");
            System.out.println("0. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (escolha) {
                case 1:
                    adicionarPessoaFisica(scanner);
                    break;
                case 2:
                    listarPessoasCadastradas();
                    break;
                case 3:
                    apagarPessoaFisica(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void adicionarPessoaFisica(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Contato: ");
        String contato = scanner.nextLine();

        if (validarDados(nome, endereco, contato)) {
            PessoaFisica pessoa = new PessoaFisica(nome, endereco, contato);
            pessoasCadastradas.add(pessoa);
            System.out.println("Pessoa Física cadastrada com sucesso. ID atribuído: " + pessoa.getId());
        } else {
            System.out.println("Dados inválidos. Não foi possível cadastrar a Pessoa Física.");
        }
    }

    private static void listarPessoasCadastradas() {
        System.out.println(pessoasCadastradas.isEmpty() ? "Nenhuma pessoa cadastrada." : "Pessoas Cadastradas:");
        pessoasCadastradas.forEach(System.out::println);
    }

    private static void apagarPessoaFisica(Scanner scanner) {
        listarPessoasCadastradas();

        if (!pessoasCadastradas.isEmpty()) {
            System.out.print("Digite o nome da pessoa a ser apagada: ");
            String nomePessoa = scanner.nextLine();

            boolean pessoaEncontrada = false;

            for (PessoaFisica pessoa : pessoasCadastradas) {
                if (pessoa.getNome().equalsIgnoreCase(nomePessoa)) {
                    removerPessoa(pessoa);
                    pessoaEncontrada = true;
                    break;
                }
            }

            if (!pessoaEncontrada) {
                System.out.println("Pessoa não encontrada. Verifique o nome e tente novamente.");
            }
        }
    }

    private static void removerPessoa(PessoaFisica pessoa) {
        pessoasCadastradas.remove(pessoa);
        System.out.println("Pessoa removida: " + pessoa);
    }

    private static boolean validarDados(String... dados) {
        return Arrays.stream(dados).noneMatch(String::isEmpty);
    }

}