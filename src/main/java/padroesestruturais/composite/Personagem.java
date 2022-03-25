package padroesestruturais.composite;

public class Personagem {

    private Competencia habilidade;

    public void setHabilidade(Competencia habilidade) {
        this.habilidade = habilidade;
    }

    public String getHabilidade() {
        if (this.habilidade == null) {
            throw new NullPointerException("Personagem sem habilidades");
        }

        return this.habilidade.getCompetencia();
    }
}
