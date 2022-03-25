package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class ArvoreHabilidade extends Competencia{

    private List<Competencia> competencias;

    public ArvoreHabilidade(String descricao) {
        super(descricao);
        this.competencias = new ArrayList<Competencia>();
    }

    public void addCompetencia(Competencia competencia) {
        this.competencias.add(competencia);
    }

    public String getCompetencia() {
        String saida = "";
        saida = "Arvore de habilidade: " + this.getDescricao() + "\n";
        for(Competencia competencia : competencias) {
            saida += competencia.getCompetencia();
        }

        return saida;
    }


}
