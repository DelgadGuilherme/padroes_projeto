package padroescriacao.abstractfactory;

public class FabricaEstagiario implements FabricaAbstrata {

    @Override
    public Contrato createContrato() {
        return new ContratoEstagiario();
    }

    @Override
    public Beneficios createBeneficio() {
        return new BeneficioEstagiario();
    }
}
