package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SessaoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Sessao sessao = new Sessao("jogos", "21h", 10.50, "Sala 1");

        Sessao sessaoClone = sessao.clone();
        sessaoClone.setHorario("15h");
        sessaoClone.setValor(8.50);

        assertEquals("Sessao{filme=jogos, horario='21h', valor=10.5, sala='Sala 1'}", sessao.toString());
        assertEquals("Sessao{filme=jogos, horario='15h', valor=8.5, sala='Sala 1'}", sessaoClone.toString());
    }

}