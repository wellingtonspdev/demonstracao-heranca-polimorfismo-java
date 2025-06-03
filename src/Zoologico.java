import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    public static void main(String[] args) {
        List<ANIMAL> meusAnimais = new ArrayList<>();

        meusAnimais.add(new Leao("Simba", 5));
        meusAnimais.add(new Tigre("Rajah", 7));
        meusAnimais.add(new Gato("Tom", 3));

        System.out.println("--- DEMONSTRAÇÃO DE POLIMORFISMO ---\n");
        
        for (ANIMAL animal : meusAnimais) {
            System.out.println("Animal: " + animal.getNome() + ", Idade: " + animal.getIdade());
            
            animal.emitirSom();
            animal.alimentar();
            animal.movimentar();

            if (animal instanceof Leao) {
                ((Leao) animal).cacarEmBando();
            } else if (animal instanceof Gato) {
                ((Gato) animal).pedirCarinho();
            }
            
            System.out.println("--------------------");
        }
    }
}