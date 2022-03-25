package padroesestruturais.decorator;

public class Propaganda extends FilmeDecorator {

    public Propaganda(Filme filme) {
        super(filme);
    }

    public float getAumentoDuracao() {
        return 2.0f;
    }

    public String getNomeEstrutura() {
        return "Propaganda";
    }
}
