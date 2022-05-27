package padroescomportamentais.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void deveArmazenarTribos() {
        Personagem personagem = new Personagem();
        personagem.setTribo(PersonagemTriboAvatar.getInstance());
        personagem.setTribo(PersonagemTriboTerra.getInstance());

        assertEquals(2, personagem.getTribos().size());
    }

    @Test
    void deveRetornarTriboInicial() {
        Personagem personagem = new Personagem();
        personagem.setTribo(PersonagemTriboAvatar.getInstance());
        personagem.setTribo(PersonagemTriboTerra.getInstance());
        personagem.restauraTribo(0);

        assertEquals(PersonagemTriboAvatar.getInstance(), personagem.getTribo());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Personagem personagem = new Personagem();
           personagem.restauraTribo(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }



}