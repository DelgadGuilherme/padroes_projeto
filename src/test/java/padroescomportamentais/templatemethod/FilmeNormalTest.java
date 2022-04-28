package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmeNormalTest {

    @Test
    void deveRetornarValorTotalFilme() {
        FilmeNormal filmeNormal = new FilmeNormal();
        filmeNormal.setValorParcial(10.0f);

        assertEquals(10.0f, filmeNormal.calcularValor());
    }

    @Test
    void  deveRetornarInformacoes() {
        FilmeNormal filmeNormal = new FilmeNormal();
        filmeNormal.setValorParcial(10.0f);
        filmeNormal.setNome("El dorado");
        filmeNormal.setHorario("22H");
        filmeNormal.setSala("Sala 2");

        assertEquals("Filme{nome='El dorado', horario=22H', valor=10.0}", filmeNormal.getInfo());
    }
}