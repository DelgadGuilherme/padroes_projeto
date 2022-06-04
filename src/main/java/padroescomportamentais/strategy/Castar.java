package padroescomportamentais.strategy;

public class Castar {

    private String forma;

    public Castar(String forma) {
        this.forma = forma;
    }

    public String usar(Habilidade habilidade) {
        return habilidade.usar(forma);
    }
}
