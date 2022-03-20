package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GuerreiroTest {

    @Test
    void deveRetornarVidaGuerreiroElfo() {
        Raca raca = new Elfo();
        Guerreiro guerreiro = new Guerreiro(100);
        guerreiro.setRaca(raca);
        assertEquals(110.0f, guerreiro.calcularVida());
    }

    @Test
    void deveRetornarVidaMagoAnao() {
        Raca raca = new Anao();
        Guerreiro guerreiro = new Guerreiro(100);
        guerreiro.setRaca(raca);
        assertEquals(120.00001f, guerreiro.calcularVida());
    }

}