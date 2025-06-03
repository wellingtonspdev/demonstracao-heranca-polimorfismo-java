import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    public static void main(String[] args) {
        // Criando uma lista do tipo genérico ANIMAL
        List<ANIMAL> meusAnimais = new ArrayList<>();

        // Adicionando objetos de tipos específicos (subclasses)
        meusAnimais.add(new Leao("Simba", 5));
        meusAnimais.add(new Tigre("Rajah", 7));
        meusAnimais.add(new Gato("Tom", 3));

        System.out.println("--- DEMONSTRAÇÃO DE POLIMORFISMO ---\n");

        // Loop para interagir com todos os animais
        for (ANIMAL animal : meusAnimais) {
            System.out.println("Animal: " + animal.getNome() + ", Idade: " + animal.getIdade());

            // **AQUI O POLIMORFISMO ACONTECE!**
            // O mesmo chamado de método (animal.emitirSom()) se comporta
            // de maneira diferente dependendo do objeto real.
            animal.emitirSom();
            animal.alimentar();
            animal.movimentar(); // Este método também foi sobrescrito em FELINO

            // Verificando o tipo para chamar métodos específicos
            if (animal instanceof Leao) {
                // É necessário fazer um "cast" para acessar o método do Leão
                ((Leao) animal).cacarEmBando();
            } else if (animal instanceof Gato) {
                ((Gato) animal).pedirCarinho();
            }

            System.out.println("--------------------");
        }
    }
}