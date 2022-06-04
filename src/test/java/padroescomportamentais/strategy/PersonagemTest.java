package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void deveUsarHabilidadeFogoBola() {
        Personagem personagem = new Personagem();
        personagem.usarHabilidadeFogo("bola");
        assertEquals("Usou a habilidade de fogo na forma bola", personagem.getHabilidadeUsada());
    }

    @Test
    void deveUsarHabilidadeGeloRaio() {
        Personagem personagem = new Personagem();
        personagem.usarHabilidadeGelo("raio");
        assertEquals("Usou a habilidade de gelo na forma raio", personagem.getHabilidadeUsada());
    }

    @Test
    void deveUsarHabilidadeGeloBola() {
        Personagem personagem = new Personagem();
        personagem.usarHabilidadeGelo("bola");
        assertEquals("Usou a habilidade de gelo na forma bola", personagem.getHabilidadeUsada());
    }

}