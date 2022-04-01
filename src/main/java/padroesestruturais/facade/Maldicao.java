package padroesestruturais.facade;

public class Maldicao extends Requisitos {

    private  static Maldicao maldicao = new Maldicao();

    private Maldicao() {};

    public static Maldicao getInstancia() {
        return maldicao;
    }
}
