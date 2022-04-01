package padroesestruturais.facade;

public class Personagem {

    public boolean LvlUp() {
        return PersonagemFacade.verificarRequisitos(this);
    }
 }
