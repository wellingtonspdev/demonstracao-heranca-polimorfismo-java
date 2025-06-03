public abstract class ANIMAL {

    private String nome;
    private int idade;

    public ANIMAL(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void emitirSom();
    public abstract void alimentar();

    public void movimentar() {
        System.out.println("O animal está se movimentando.");
    }

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