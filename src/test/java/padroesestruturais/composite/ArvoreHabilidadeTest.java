package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArvoreHabilidadeTest {

    @Test
    void deveRetortnarHabilidadesPersonagem() {
        ArvoreHabilidade arvoreHabilidade1 = new ArvoreHabilidade("Agua");

        ArvoreHabilidade arvoreHabilidade2 = new ArvoreHabilidade("Fogo");
        Habilidade habilidade1 = new Habilidade("Bola de fogo");
        Habilidade habilidade2 = new Habilidade("Meteoro");
        arvoreHabilidade2.addCompetencia(habilidade1);
        arvoreHabilidade2.addCompetencia(habilidade2);

        ArvoreHabilidade arvoreHabilidade3 = new ArvoreHabilidade("Terra");
        Habilidade habilidade3 = new Habilidade("Bola de pedra");
        arvoreHabilidade3.addCompetencia(habilidade3);

        ArvoreHabilidade habilidades = new ArvoreHabilidade("Habilidades magicas");
        habilidades.addCompetencia(arvoreHabilidade1);
        habilidades.addCompetencia(arvoreHabilidade2);
        habilidades.addCompetencia(arvoreHabilidade3);

        Personagem personagem = new Personagem();
        personagem.setHabilidade(habilidades);

        assertEquals("Arvore de habilidade: Habilidades magicas\n" +
                "Arvore de habilidade: Agua\n" +
                "Arvore de habilidade: Fogo\n" +
                "Habilidade: Bola de fogo\n" +
                "Habilidade: Meteoro\n" +
                "Arvore de habilidade: Terra\n" +
                "Habilidade: Bola de pedra\n", personagem.getHabilidade());
    }

    @Test
    void deveRetornarExecacaoPersonagemSemHabilidade() {
        try {
            Personagem personagem = new Personagem();
            personagem.getHabilidade();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Personagem sem habilidades", e.getMessage());
        }
    }
}
