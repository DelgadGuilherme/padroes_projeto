package padroescomportamentais.templatemethod;

public class Filme3D extends Filme {

    public float calcularValor() {
        return this.getValorParcial() + 10.50f;
    }

    @Override
    public String getTipo() {
        return "Filme3D";
    }
}
