package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContratoTest {

    ColaboradorRH rh;
    ColaboradorGestor gestor;

    @BeforeEach
    void setUp() {
        gestor = new ColaboradorGestor(null);
        rh = new ColaboradorRH(gestor);
    }

    @Test
    void deveRetornarRhParaAssinarContratoEstagio() {
        assertEquals("RH", rh.assinarContrato(new Contrato(TipoContratoEstagiario.getTipoContratoEstagiario())));
    }

    @Test
    void deveRetornarGestorParaAssinarContratoDesenvolvedor() {
        assertEquals("Gestor", rh.assinarContrato(new Contrato(TipoContratoDesenvolvedor.getTipoContratoDesenvolvedor())));
    }

}