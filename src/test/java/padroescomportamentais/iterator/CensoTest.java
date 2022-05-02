package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void deveContarPessoasVacinadasCidade(){
        Cidade cidade = new Cidade(
                new Pessoa("Lucas", "Centro", true),
                new Pessoa("Guilherme", "Centro", true),
                new Pessoa("Jose", "Madruga",false),
                new Pessoa("Maria", "Madruga",true)

        );
        assertEquals(3, Censo.pessoasVacinadasCidade(cidade));
    }

    @Test
    void deveContarPessoasVacinadasBairro(){
        Cidade cidade = new Cidade(
                new Pessoa("Lucas", "Centro", true),
                new Pessoa("Guilherme", "Centro", true),
                new Pessoa("Jose", "Madruga",false),
                new Pessoa("Maria", "Madruga",true)

        );
        assertEquals(2, Censo.pessoasVacidadaBairro(cidade, "Centro"));
    }

    @Test
    void deveContarPessoasCidade(){
        Cidade cidade = new Cidade(
                new Pessoa("Lucas", "Centro", true),
                new Pessoa("Guilherme", "Centro", true),
                new Pessoa("Jose", "Madruga",false),
                new Pessoa("Maria", "Madruga",true)

        );
        assertEquals(4, Censo.totalPessoasCidade(cidade));
    }

}