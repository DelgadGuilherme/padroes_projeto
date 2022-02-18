package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarNomeImpressora() {
        Parametros.getInstance().setNomeImpressora("Impressora 1");
        assertEquals("Impressora 1", Parametros.getInstance().getNomeImpressora());
    }

    @Test
    public void deveRetornarIpImpressora() {
        Parametros.getInstance().setIpImpressora("123.456.789");
        assertEquals("123.456.789", Parametros.getInstance().getIpImpressora());
    }

    @Test
    public void deveRetornarSenhaImpressora() {
        Parametros.getInstance().setSenhaImpressora("123456789");
        assertEquals("123456789", Parametros.getInstance().getSenhaImpressora());
    }

}