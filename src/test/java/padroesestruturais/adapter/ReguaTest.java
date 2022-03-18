package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReguaTest {

    @Test
    void deveRetornarPesRegua() {
        Regua regua = new Regua();
        regua.setMedida(1f);

        assertEquals(1f, regua.getMedida());
    }

    @Test
    void  deveRetornarCMRegua() {
        Regua regua = new Regua();
        regua.setMedida(1f);

        assertEquals(31.249998092651367f, regua.getMedidaCM());
    }

}