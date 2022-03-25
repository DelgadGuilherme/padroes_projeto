package padroesestruturais.decorator;

public abstract class FilmeDecorator implements Filme {

    private Filme filme;
    public String estrutura;

    public FilmeDecorator(Filme filme) {
        this.filme = filme;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public abstract float getAumentoDuracao();

    public float getDuracao() {
        return this.filme.getDuracao() + this.getAumentoDuracao();
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.filme.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void  setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}
