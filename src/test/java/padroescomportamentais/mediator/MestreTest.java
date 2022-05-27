package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MestreTest {


    @Test
    void devePublicarNoticia() {
        Mestre mestre = new Mestre();
        assertEquals("A noticia publicada poderá te ajudar na aventura.\nNoticia publicada: Existe um monstro rondando a floresta esquecida", mestre.PublicarNoticia("Existe um monstro rondando a floresta esquecida"));
    }

    @Test
    void devePublicarQuest() {
        Mestre mestre = new Mestre();
        assertEquals("Quest publicada.\nQuest publicada: Matar um monstro que ronda a floresta esquecida", mestre.publicarQuest("Matar um monstro que ronda a floresta esquecida"));
    }
}