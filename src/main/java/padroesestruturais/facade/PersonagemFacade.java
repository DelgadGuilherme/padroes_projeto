package padroesestruturais.facade;

import com.sun.tools.javac.Main;

public class PersonagemFacade {

    public static boolean verificarRequisitos(Personagem personagem) {
        if (Maldicao.getInstancia().verficarPersonagemNaoAtendeRequisitos(personagem)) {
            return false;
        }

        if (MainQuestFail.getInstancia().verficarPersonagemNaoAtendeRequisitos(personagem)) {
            return false;
        }

        return true;
    }
}
