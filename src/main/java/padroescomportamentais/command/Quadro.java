package padroescomportamentais.command;

public class Quadro {

    private String cidade;
    private String situacao;

    public Quadro(String cidade) {
        this.cidade = cidade;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirQuadro() {
        this.situacao = "Quadro de quests aberto";
    }

    public void fecharQuadro() {
        this.situacao = "Quadro de quests fechado";
    }
}
