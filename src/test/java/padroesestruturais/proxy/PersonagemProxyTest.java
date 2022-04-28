package padroesestruturais.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemProxyTest {

    @BeforeEach
    void setUp() {
        DB.addPersonagem(new Personagem(true,1,  "Yuumi", "100", "50", "Livro magico"));
        DB.addPersonagem(new Personagem(false, 2,  "Sona", "110", "90", "Piano"));
    }

    @Test
    void deveRetornarDadosPersonagem() {
        PersonagemProxy personagem = new PersonagemProxy(1);

        assertEquals(Arrays.asList("Yuumi", "100"), personagem.obterDados());
    }

    @Test
    void deveRetornarStatusPersonagem() {
        Personagem personagem = new Personagem(true, 4,  "Leona", "110", "90", "Espada");
        PersonagemProxy personagemProxy = new PersonagemProxy(2);

        assertEquals(Arrays.asList("90","Piano"), personagemProxy.obterStatus(personagem));

    }

    @Test
    void deveRetornarErroStatusPersonagem() {
        try {
            Personagem personagem = new Personagem(false, 5,  "Ahri", "110", "90", "Bola");
            PersonagemProxy personagemProxy = new PersonagemProxy(2);

            personagemProxy.obterStatus(personagem);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Personagem nao autorizado", e.getMessage());
        }

    }
}