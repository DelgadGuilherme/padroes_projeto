package padroescomportamentais.command;

public class FecharQuadroQuest implements Quest{

    private Quadro quadro;

    public FecharQuadroQuest(Quadro quadro) {
        this.quadro = quadro;
    }

    public void executar() {
        this.quadro.fecharQuadro();
    }

    public void cancelar() {
        this.quadro.abrirQuadro();
    }
}
