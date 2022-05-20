package padroescomportamentais.chainofresponsability;

public class TipoContratoEstagiario implements TipoContrato {

    private static TipoContratoEstagiario tipoContratoEstagiario = new TipoContratoEstagiario();

    private TipoContratoEstagiario() {};

    public static TipoContratoEstagiario getTipoContratoEstagiario() {
        return tipoContratoEstagiario;
    }
}
