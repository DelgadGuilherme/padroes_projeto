package padroescomportamentais.chainofresponsability;

public class ColaboradorGestor extends Colaborador{

    public ColaboradorGestor(Colaborador superior) {
        listaContratos.add(TipoContratoDesenvolvedor.getTipoContratoDesenvolvedor());
        setColaboradorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gestor";
    }
}
