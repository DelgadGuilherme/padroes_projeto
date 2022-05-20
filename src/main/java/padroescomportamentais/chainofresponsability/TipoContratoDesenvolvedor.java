package padroescomportamentais.chainofresponsability;

public class TipoContratoDesenvolvedor implements TipoContrato {

    private static TipoContratoDesenvolvedor tipoContratoDesenvolvedor = new TipoContratoDesenvolvedor();

    private TipoContratoDesenvolvedor() {};

    public static TipoContratoDesenvolvedor getTipoContratoDesenvolvedor() {
        return tipoContratoDesenvolvedor;
    }
}
