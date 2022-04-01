package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void deveRetornarPersonagemNaoAtendeRequisitosMaldicaoLvlUp() {
        Personagem personagem = new Personagem();
        Maldicao.getInstancia().addPersonagem(personagem);

        assertEquals(false, personagem.LvlUp());
    }

    @Test
    void deveRetornarPersonagemNaoAtendeRequisitosMainQuestFailLvlUp() {
        Personagem personagem = new Personagem();
        MainQuestFail.getInstancia().addPersonagem(personagem);

        assertEquals(false, personagem.LvlUp());
    }

    @Test
    void deveRetornarPersonagemAtendeRequisitosLvlUp() {
        Personagem personagem = new Personagem();

        assertEquals(true, personagem.LvlUp());
    }


}