package padroesestruturais.bridge;

public class Guerreiro extends Personagem{

    public Guerreiro(float vidaBase) {
        super(vidaBase);
    }

    public float calcularVida() {
        return this.vidaBase * (1 + this.raca.percentualAumento());
    }
}
