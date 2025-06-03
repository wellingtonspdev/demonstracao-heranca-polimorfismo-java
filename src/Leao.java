// Leao herda de FELINO (que por sua vez herda de ANIMAL)
public class Leao extends FELINO {

    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    // ## POLIMORFISMO (Implementação de método abstrato) ##
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " ruge: ROAR!");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " está comendo carne de grandes presas.");
    }

    // Método específico do Leão
    public void cacarEmBando() {
        System.out.println("O leão " + getNome() + " está caçando em bando.");
    }
}