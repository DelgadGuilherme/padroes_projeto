package padroesestruturais.facade;

public class MainQuestFail extends Requisitos {

    private  static MainQuestFail mainQuestFail = new MainQuestFail();

    private MainQuestFail() {};

    public static MainQuestFail getInstancia() {
        return mainQuestFail;
    }
}
