package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GuildaTest {

    @Test
    void deveRetornarPersonagens() {
        Guilda guilda = new Guilda();
        guilda.Contratar("Sona", "Muda", "Demacia");
        guilda.Contratar("Yummi", "Gato", "Bandopolis");
        guilda.Contratar("Yasuo", "Lixo", "Ionia");
        guilda.Contratar("Rengar", "Gato", "Vastaya");

        List<String> saida = Arrays.asList(
                "Personagem {nome='Sona', raca='Muda', regiao='Demacia'}",
                "Personagem {nome='Yummi', raca='Gato', regiao='Bandopolis'}",
                "Personagem {nome='Yasuo', raca='Lixo', regiao='Ionia'}",
                "Personagem {nome='Rengar', raca='Gato', regiao='Bandopolis'}");

        assertEquals(saida, guilda.obterPersonagens());
    }

    @Test
    void deveRetornarTotalRacas() {
        Guilda guilda = new Guilda();
        guilda.Contratar("Sona", "Muda", "Demacia");
        guilda.Contratar("Yummi", "Gato", "Bandopolis");
        guilda.Contratar("Yasuo", "Lixo", "Ionia");
        guilda.Contratar("Rengar", "Gato", "Vastaya");

        assertEquals(3, RacaFactory.getTotalRacas());
    }

}