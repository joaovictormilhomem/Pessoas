public class GerenciadorDePessoas {
  private Pessoa pessoa1;
  private Pessoa pessoa2;

  public void cadastrarPessoa1(Pessoa pessoa) {
    this.pessoa1 = pessoa;
  }

  public void cadastrarPessoa2(Pessoa pessoa) {
    this.pessoa2 = pessoa;
  }

  public void atualizarPessoa1(Pessoa pessoa) {
    this.pessoa1 = pessoa;
  }

  public void atualizarPessoa2(Pessoa pessoa) {
    this.pessoa2 = pessoa;
  }

  public void exibirPessoa1() {
    if (pessoa1 != null) {
      System.out.println("Pessoa 1: " + pessoa1.toString());
    } else {
      System.out.println("Pessoa 1 não cadastrada.");
    }
  }

  public void exibirPessoa2() {
    if (pessoa2 != null) {
      System.out.println("Pessoa 2: " + pessoa2.toString());
    } else {
      System.out.println("Pessoa 2 não cadastrada.");
    }
  }
}
