package padroescomportamentais.strategy;

public class HabilidadeFogo implements Habilidade {

    public String usar(String forma) {
        return "Usou a habilidade de fogo na forma " + forma;
    }
}
