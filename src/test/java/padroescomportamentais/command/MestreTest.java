package padroescomportamentais.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MestreTest {

    Mestre mestre;
    Quadro quadro;

    @BeforeEach
    void setUp() {
        mestre = new Mestre();
        quadro = new Quadro("valhalla");
    }

    @Test
    void deveAbrirQuadro() {
        Quest aberturaQuadro = new AberturaQuadroQuest(quadro);
        mestre.executarQuest(aberturaQuadro);

        assertEquals("Quadro de quests aberto", quadro.getSituacao());
    }

    @Test
    void deveFecharQuadro() {
        Quest fecharQuadro = new FecharQuadroQuest(quadro);
        mestre.executarQuest(fecharQuadro);

        assertEquals("Quadro de quests fechado", quadro.getSituacao());
    }

    @Test
    void deveCancelarFechamentoQuadro(){
        Quest aberturaQuadro = new AberturaQuadroQuest(quadro);
        Quest fecharQuadro = new FecharQuadroQuest(quadro);

        mestre.executarQuest(aberturaQuadro);
        mestre.executarQuest(fecharQuadro);

        mestre.cancelarUltimaQuest();

        assertEquals("Quadro de quests aberto", quadro.getSituacao());
    }
}