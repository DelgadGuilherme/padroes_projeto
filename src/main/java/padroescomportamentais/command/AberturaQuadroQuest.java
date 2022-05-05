package padroescomportamentais.command;

public class AberturaQuadroQuest implements Quest{

    private Quadro quadro;

    public AberturaQuadroQuest(Quadro quadro) {
        this.quadro = quadro;
    }

    public void executar() {
        this.quadro.abrirQuadro();
    }

    public void cancelar() {
        this.quadro.fecharQuadro();
    }
}
