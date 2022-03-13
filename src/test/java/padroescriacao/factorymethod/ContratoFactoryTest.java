package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContratoFactoryTest {
    @Test
    void deveRetornarExcecaoParaContratoInexistente() {
        try {
            Contrato contrato = ContratoFactory.obterContrato("Analista");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Contrato inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaContratoInvalido() {
        try {
            Contrato contrato = ContratoFactory.obterContrato("Arquiteto");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Contrato inválido", e.getMessage());
        }
    }
}