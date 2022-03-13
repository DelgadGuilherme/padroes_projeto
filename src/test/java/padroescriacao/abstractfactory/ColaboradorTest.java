package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColaboradorTest {

    @Test
    void deveRetornarContratoEstagiario() {
        FabricaAbstrata fabrica = new FabricaEstagiario();
        Colaborador colaborador = new Colaborador(fabrica);
        assertEquals("contrato estagiario", colaborador.imprimirContrato());
    }

    @Test
    void deveRetornarBeneficiosEstagiario() {
        FabricaAbstrata fabrica = new FabricaEstagiario();
        Colaborador colaborador = new Colaborador(fabrica);
        assertEquals("Beneficio estagiario", colaborador.imprimiBeneficios());
    }
}
