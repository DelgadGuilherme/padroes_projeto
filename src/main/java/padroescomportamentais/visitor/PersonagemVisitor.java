package padroescomportamentais.visitor;

public class PersonagemVisitor implements Visitor {

    public String exibir(Personagem personagem) {
        return personagem.aceitar(this);
    }

    @Override
    public String exibirLider(Lider lider) {
        return "Lider{" +
                "nome=" + lider.getNome() +
                ", raça=" + lider.getRaça() +
                "}";
    }

    @Override
    public String exibirMestre(Mestre mestre) {
        return "Mestre{" +
                "nome=" + mestre.getNome() +
                ", raça=" + mestre.getRaça() +
                "}";
    }
}
