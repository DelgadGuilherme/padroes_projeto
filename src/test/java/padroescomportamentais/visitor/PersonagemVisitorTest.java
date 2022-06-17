package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemVisitorTest {

    @Test
    void deveExibirLider() {
        Lider lider = new Lider("Sona", "Ionia");

        PersonagemVisitor visitor = new PersonagemVisitor();
        assertEquals("Lider{nome=Sona, raça=Ionia}", visitor.exibir(lider));
    }

    @Test
    void deveExibirMestre() {
        Mestre mestre = new Mestre("Yummi", "Yordle");

        PersonagemVisitor visitor = new PersonagemVisitor();
        assertEquals("Mestre{nome=Yummi, raça=Yordle}", visitor.exibir(mestre));
    }
}