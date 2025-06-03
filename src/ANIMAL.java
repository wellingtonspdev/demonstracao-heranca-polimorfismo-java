public abstract class ANIMAL {

    // ## ENCAPSULAMENTO ##
    // Atributos protegidos para serem acessíveis pelas subclasses
    private String nome;
    private int idade;

    // Construtor
    public ANIMAL(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // ## MÉTODOS ABSTRATOS (para Polimorfismo) ##
    // Toda subclasse será OBRIGADA a implementar esses métodos.
    public abstract void emitirSom();
    public abstract void alimentar();

    // Método concreto que será herdado por todas as subclasses
    public void movimentar() {
        System.out.println("O animal está se movimentando.");
    }

    // Getters e Setters para o encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}