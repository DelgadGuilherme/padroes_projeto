package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Filme3DTest {
    @Test
    void deveRetornarValorTotalFilme() {
        Filme3D filme3D = new Filme3D();
        filme3D.setValorParcial(10.0f);

        assertEquals(20.5f, filme3D.calcularValor());
    }

    @Test
    void  deveRetornarInformacoes() {
        Filme3D filme3D = new Filme3D();
        filme3D.setValorParcial(10.0f);
        filme3D.setNome("El dorado");
        filme3D.setHorario("22H");
        filme3D.setSala("Sala 2");

        assertEquals("Filme3D{nome='El dorado', horario=22H', valor=20.5}", filme3D.getInfo());
    }
}