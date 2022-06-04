package padroescomportamentais.strategy;

public class Personagem {

    private String habilidadeUsada;

    public String getHabilidadeUsada() {
        return habilidadeUsada;
    }

    public void usarHabilidadeFogo(String forma) {
        Castar castar = new Castar(forma);
        this.habilidadeUsada = castar.usar(new HabilidadeFogo());
    }

    public void usarHabilidadeGelo(String forma) {
        Castar castar = new Castar(forma);
        this.habilidadeUsada = castar.usar(new HabilidadeGelo());
    }


}
