package padroesestruturais.decorator;

public class FilmeCartaz implements Filme {

    public float duracao;

    public FilmeCartaz(float duracao) {
        this.duracao = duracao;
    }

    public float getDuracao() {
        return duracao;
    }

    public String getEstrutura() {
        return "Filme Cartaz";
    }


}
