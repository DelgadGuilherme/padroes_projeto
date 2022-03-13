package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContratoEstagiarioTest {

    @Test
    void deveExecutarContratacao() {
        Contrato contrato = ContratoFactory.obterContrato("Estagiario");
        assertEquals("Contrato efetivado", contrato.contratar());
    }

    @Test
    void deveRetornarContrato() {
        Contrato contrato = ContratoFactory.obterContrato("Estagiario");
        assertEquals("Contrato de estagiario", contrato.imprimir());
    }

    @Test
    void deveExecutarDemissao() {
        Contrato contrato = ContratoFactory.obterContrato("Estagiario");
        assertEquals("Contrato rescindido", contrato.demitir());
    }
}