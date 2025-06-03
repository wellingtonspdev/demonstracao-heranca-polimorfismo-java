public abstract class FELINO extends ANIMAL {

    public FELINO(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void movimentar() {
        System.out.println("O felino corre de forma ágil e silenciosa.");
    }

    public void afiarGarras() {
        System.out.println("O felino está afiando suas garras.");
    }
}