// ## HERANÇA ##
// FELINO herda tudo que ANIMAL tem.
public abstract class FELINO extends ANIMAL {

    // Construtor que chama o construtor da superclasse (ANIMAL)
    public FELINO(String nome, int idade) {
        super(nome, idade); // A palavra 'super' chama o construtor da classe pai
    }

    // ## POLIMORFISMO (Sobrescrita) ##
    // Podemos sobrescrever um método que já existia na classe pai
    // para dar um comportamento mais específico.
    @Override
    public void movimentar() {
        System.out.println("O felino corre de forma ágil e silenciosa.");
    }

    // Método específico de felinos
    public void afiarGarras() {
        System.out.println("O felino está afiando suas garras.");
    }
}