package padroescomportamentais.templatemethod;

public class FilmeNormal extends Filme {

    public float calcularValor() {
        return this.getValorParcial();
    }
}
