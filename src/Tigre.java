public class Tigre extends FELINO {

    public Tigre(String nome, int idade) {
        super(nome, idade);
    }

    // ## POLIMORFISMO ##
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " rosna: GRRRR!");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " está comendo carne de cervo.");
    }

    // Método específico do Tigre
    public void cacarSozinho() {
        System.out.println("O tigre " + getNome() + " é um caçador solitário.");
    }
}