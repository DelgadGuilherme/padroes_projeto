package padroesestruturais.decorator;

public class Trailer extends FilmeDecorator {

    public Trailer(Filme filme) {
        super(filme);
    }

    public float getAumentoDuracao() {
        return 5.50f;
    }

    public String getNomeEstrutura() {
        return "Trailer";
    }
}
