package padroesestruturais.bridge;

public class Mago extends Personagem {

    public Mago(float vidaBase) {
        super(vidaBase);
    }

    public float calcularVida() {
        return this.vidaBase * (1 + this.raca.percentualAumento());
    }
}
