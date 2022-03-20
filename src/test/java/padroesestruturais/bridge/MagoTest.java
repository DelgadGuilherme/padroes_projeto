package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagoTest {

    @Test
    void deveRetornarVidaMagoElfo() {
        Raca raca = new Elfo();
        Mago mago = new Mago(95);
        mago.setRaca(raca);
        assertEquals(104.5f, mago.calcularVida());
    }

    @Test
    void deveRetornarVidaMagoAnao() {
        Raca raca = new Anao();
        Mago mago = new Mago(95);
        mago.setRaca(raca);
        assertEquals(114.00001f, mago.calcularVida());
    }

}