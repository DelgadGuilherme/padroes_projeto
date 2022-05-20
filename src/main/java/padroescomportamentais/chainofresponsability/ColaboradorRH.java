package padroescomportamentais.chainofresponsability;

public class ColaboradorRH extends Colaborador {

    public ColaboradorRH(Colaborador superior) {
        listaContratos.add(TipoContratoEstagiario.getTipoContratoEstagiario());
        setColaboradorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "RH";
    }

}
