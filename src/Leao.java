public class Leao extends FELINO {

    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " ruge: ROAR!");
    }
    
    @Override
    public void alimentar() {
        System.out.println(getNome() + " está comendo carne de grandes presas.");
    }

    public void cacarEmBando() {
        System.out.println("O leão " + getNome() + " está caçando em bando.");
    }
}