package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Colaborador {

    protected ArrayList listaContratos = new ArrayList();
    private Colaborador colaboradorSuperior;

    public Colaborador getColaboradorSuperior() {
        return colaboradorSuperior;
    }

    public void setColaboradorSuperior(Colaborador colaboradorSuperior) {
        this.colaboradorSuperior = colaboradorSuperior;
    }

    public abstract String getDescricaoCargo();

    public String assinarContrato(Contrato contrato) {
        if (listaContratos.contains(contrato.getTipoContrato())) {
            return getDescricaoCargo();
        }
        else {
            if (colaboradorSuperior != null) {
                return colaboradorSuperior.assinarContrato(contrato);
            }
            else
            {
                return "Sem assinatura";
            }
        }
    }
}
