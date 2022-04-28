package padroesestruturais.proxy;

import java.util.HashMap;
import java.util.Map;

public class DB {
    private static Map<Integer, Personagem> personagens = new HashMap<>();

    public static Personagem getPersonagem(Integer codigoGuilda) {
        return personagens.get(codigoGuilda);
    }

    public static void addPersonagem(Personagem personagem) {
        personagens.put(personagem.getCodigoGuilda(), personagem);
    }
}
