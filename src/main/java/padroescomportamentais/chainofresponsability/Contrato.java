package padroescomportamentais.chainofresponsability;

public class Contrato {

    private TipoContrato tipoContrato;

    public Contrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}
