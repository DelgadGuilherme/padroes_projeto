package padroescomportamentais.mediator;

public class Personagem {

    public String PublicarNoticia(String mensagem) {
        return Vila.getInstance().publicarNoticiaQuadroPrincipal(mensagem);
    }

    public String publicarQuest(String mensagem) {
        return  Vila.getInstance().publicarQuestQuadroPrincipal(mensagem);
    }
}
