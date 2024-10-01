# Sistema de Gerenciamento de Pessoas

## Descrição

Este sistema em Java permite o cadastro, atualização e exibição dos dados de duas pessoas, utilizando conceitos de encapsulamento e orientação a objetos. A classe `GerenciadorDePessoas` é responsável por gerenciar os dados de `Pessoa`, que inclui nome, CPF e idade.

## Instruções de Compilação e Execução

1. **Clone ou baixe o repositório** para seu ambiente local.
2. **Compile as classes** com o seguinte comando (na pasta onde os arquivos `.java` estão localizados):

  ```bash
   javac Main.java
  ```
3. **Execute o sistema:

  ```bash
   java Main
  ```

## Exemplo de Uso
Ao rodar o sistema, você verá a seguinte sequência de ações:

Cadastro de duas pessoas:

Pessoa 1: Nome: Ana Silva, CPF: 123.456.789-00, Idade: 30
Pessoa 2: Nome: João Souza, CPF: 987.654.321-00, Idade: 25
Exibição dos dados das duas pessoas cadastradas.

Atualização dos dados da Pessoa 1 para:

Nome: Ana Silva Santos, CPF: 123.456.789-00, Idade: 31
Exibição dos dados após a atualização.

## Encapsulamento
O conceito de encapsulamento foi aplicado protegendo os atributos da classe Pessoa com o modificador de acesso private, garantindo que eles só possam ser acessados ou modificados por meio dos métodos get e set. Dessa forma, o acesso aos dados das pessoas é controlado, permitindo validações e regras de negócio no futuro. A classe GerenciadorDePessoas faz a gestão dessas instâncias de Pessoa sem acessar diretamente seus atributos, mantendo a integridade das informações.