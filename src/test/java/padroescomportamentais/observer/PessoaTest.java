package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveNotificarUmaPessoa() {
        Rastreio rastreio = new Rastreio("Produto 1", "Rua A");
        Pessoa pessoa = new Pessoa("Jose");

        pessoa.rastrear(rastreio);
        rastreio.alterarStatus();
        assertEquals("Jose Atualizacao no transporte de Produto 1", pessoa.getUltimaNotificacao());
    }

    @Test
    void deveNotificarPessoas() {
        Rastreio rastreio = new Rastreio("Produto 1", "Rua A");
        Pessoa pessoa = new Pessoa("Jose");
        Pessoa vendedor = new Pessoa("vendedor");

        pessoa.rastrear(rastreio);
        vendedor.rastrear(rastreio);
        rastreio.alterarStatus();
        assertEquals("Jose Atualizacao no transporte de Produto 1", pessoa.getUltimaNotificacao());
        assertEquals("vendedor Atualizacao no transporte de Produto 1", vendedor.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarUmaPessoa() {
        Rastreio rastreio = new Rastreio("Produto 1", "Rua A");
        Pessoa pessoa = new Pessoa("Jose");

        rastreio.alterarStatus();
        assertEquals(null, pessoa.getUltimaNotificacao());
    }

}