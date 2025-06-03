public class Gato extends FELINO {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " mia: Miau! Miau!");
    }
    
    @Override
    public void alimentar() {
        System.out.println(getNome() + " está comendo sua ração de salmão.");
    }

    @Override
    public void afiarGarras() {
        System.out.println("O gato " + getNome() + " está afiando as garras no sofá.");
    }

    public void pedirCarinho() {
        System.out.println(getNome() + " está se esfregando na sua perna e ronronando.");
    }
}