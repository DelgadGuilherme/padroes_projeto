package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {

    @Test
    void deveRetornarDuracaoFilme() {
        Filme filme = new FilmeCartaz(90.0f);

        assertEquals(90.0f, filme.getDuracao());
    }

    @Test
    void deveRetornarDuracaoFilmeComTrailer() {
        Filme filme = new Trailer(new FilmeCartaz(90.0f));

        assertEquals(95.5f, filme.getDuracao());
    }

    @Test
    void deveRetornarDuracaoFilmeComTrailerEPropaganda() {
        Filme filme = new Propaganda(new Trailer(new FilmeCartaz(90.0f)));

        assertEquals(97.5f, filme.getDuracao());
    }

    @Test
    void deveRetornarEstruturaFilme() {
        Filme filme = new FilmeCartaz(90.0f);

        assertEquals("Filme Cartaz", filme.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaFilmeComTrailer() {
        Filme filme = new Trailer(new FilmeCartaz(90.0f));

        assertEquals("Filme Cartaz/Trailer", filme.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaFilmeComTrailerEPropaganda() {
        Filme filme = new Propaganda(new Trailer(new FilmeCartaz(90.0f)));

        assertEquals("Filme Cartaz/Trailer/Propaganda", filme.getEstrutura());
    }
}