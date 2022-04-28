package padroesestruturais.proxy;

import java.util.List;

public class PersonagemProxy implements IPersonagem {

    private Personagem personagem;
    private Integer codigoGuilda;

    public PersonagemProxy(Integer codigoGuilda) {
        this.codigoGuilda = codigoGuilda;
    }

    @Override
    public List<String> obterDados() {
        if (this.personagem == null) {
            this.personagem = new Personagem(this.codigoGuilda);
        }
        return this.personagem.obterDados();
    }

    @Override
    public List<String> obterStatus(Personagem personagem) {
        if (!personagem.isMestre()) {
            throw new IllegalArgumentException("Personagem nao autorizado");
        }
        if (this.personagem == null) {
            this.personagem = new Personagem(this.codigoGuilda);
        }
        return this.personagem.obterStatus(personagem);
    }

}
