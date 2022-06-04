package padroescomportamentais.strategy;

public class HabilidadeGelo implements Habilidade {

    public String usar(String forma) {
        return "Usou a habilidade de gelo na forma " + forma;
    }
}
