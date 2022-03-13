package padroescriacao.factorymethod;

public class ContratoFactory {

    public static Contrato obterContrato(String contrato) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroescriacao.factorymethod.Contrato" + contrato);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Contrato inexistente");
        }
        if (!(objeto instanceof Contrato)) {
            throw new IllegalArgumentException("Contrato inválido");
        }
        return (Contrato) objeto;
    }

}
