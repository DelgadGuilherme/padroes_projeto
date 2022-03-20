package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Guilda {

    private List<Personagem> personagens = new ArrayList<>();

    public void Contratar(String nomePersonagem, String nomeRaca, String regiao) {
        Raca raca = RacaFactory.getRaca(nomeRaca, regiao);
        Personagem personagem = new Personagem(nomePersonagem, raca);
        personagens.add(personagem);
    }

    public List<String> obterPersonagens() {
        List<String> saida = new ArrayList<>();
        for (Personagem personagem : this.personagens) {
            saida.add(personagem.obterPersonagem());
        }
        return saida;
    }
}
