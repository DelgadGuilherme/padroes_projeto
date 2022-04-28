package padroesestruturais.proxy;

import java.util.List;

public interface IPersonagem {

    List<String> obterDados();
    List<String> obterStatus(Personagem personagem);
}
