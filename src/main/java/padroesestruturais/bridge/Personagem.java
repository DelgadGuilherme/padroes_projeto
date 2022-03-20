package padroesestruturais.bridge;

public abstract class Personagem {

    protected Raca raca;

    protected float vidaBase;

    public Personagem(float vidaBase) {
        this.vidaBase = vidaBase;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public void setVidaBase(float vidaBase) {
        this.vidaBase = vidaBase;
    }

    public abstract float calcularVida();
}
