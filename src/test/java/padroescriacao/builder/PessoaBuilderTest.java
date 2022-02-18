package padroescriacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaBuilderTest {

    @Test
    void deveRetornarExcecaoParaPessoaSemNome() {
        try {
            PessoaBuilder pessoaBuilder = new PessoaBuilder();
            Pessoa pessoa = pessoaBuilder.setEmail("Pessoa@hotmail.com").build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPessoaSemEmail() {
        try {
            PessoaBuilder pessoaBuilder = new PessoaBuilder();
            Pessoa pessoa = pessoaBuilder.setNome("Pessoa").build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Email invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarPessoaValida() {
        PessoaBuilder pessoaBuilder = new PessoaBuilder();
        Pessoa pessoa = pessoaBuilder.setEmail("Pessoa@hotmail.com").setNome("Pessoa").build();

        assertNotNull(pessoa);
    }

}