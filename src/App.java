public class App {
    public static void main(String[] args) {
        // Criando o GerenciadorDePessoas
        GerenciadorDePessoas gerenciador = new GerenciadorDePessoas();

        // Cadastrando as pessoas
        Pessoa pessoa1 = new Pessoa("Ana Silva", "123.456.789-00", 30);
        Pessoa pessoa2 = new Pessoa("João Souza", "987.654.321-00", 25);

        gerenciador.cadastrarPessoa1(pessoa1);
        gerenciador.cadastrarPessoa2(pessoa2);

        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();

        Pessoa pessoaAtualizada = new Pessoa("Ana Silva Santos", "123.456.789-00", 31);
        gerenciador.atualizarPessoa1(pessoaAtualizada);

        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();
    }
}
