public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;

    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    // Método para exibir informações da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
    }

    public static void main(String[] args) {
        // Criando uma instância de Pessoa
        Pessoa pessoa1 = new Pessoa("João", 30, "Rua A, 123");

        // Exibindo informações da pessoa
        pessoa1.exibirInformacoes();
    }
}
