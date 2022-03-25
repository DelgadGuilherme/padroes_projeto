package padroesestruturais.composite;

public class Habilidade extends Competencia {

    public Habilidade(String descricao) {
        super(descricao);
    }

    public String getCompetencia() {
        return "Habilidade: " + this.getDescricao() + "\n";
    }


}
