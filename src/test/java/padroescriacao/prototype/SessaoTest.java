package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SessaoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Sessao sessao = new Sessao("Jogos", "21h", 10.50, "Sala 1");

        Sessao sessaoClone = sessao.clone();
        sessaoClone.setHorario("15h");
        sessaoClone.setValor(8.50);

        assertEquals("Sessao{nome='jogos', horario'21h', valor=10.50, sala='Sala 1'}", sessao.toString());
        assertEquals("Sessao{nome='jogos', horario'15h', valor=8.50, sala='Sala 1'}", sessaoClone.toString());
    }

}