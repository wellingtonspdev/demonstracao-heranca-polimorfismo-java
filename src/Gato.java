public class Gato extends FELINO {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    // ## POLIMORFISMO ##
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " mia: Miau! Miau!");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " está comendo sua ração de salmão.");
    }

    // Sobrescrita de um método que NÃO era abstrato
    @Override
    public void afiarGarras() {
        System.out.println("O gato " + getNome() + " está afiando as garras no sofá.");
    }

    // Método específico do Gato
    public void pedirCarinho() {
        System.out.println(getNome() + " está se esfregando na sua perna e ronronando.");
    }
}