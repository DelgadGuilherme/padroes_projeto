package padroescomportamentais.mediator;

public class Vila {

    private static Vila instancia = new Vila();

    private Vila() {}

    public static Vila getInstance() {return instancia;}

    public String publicarNoticiaQuadroPrincipal(String mensagem) {
        return "A noticia publicada poderá te ajudar na aventura.\n" + QuadroPrincipalVila.getInstance().publicarNoticia(mensagem);
    }

    public String publicarQuestQuadroPrincipal(String mensagem) {
        return "Quest publicada.\n" + QuadroPrincipalVila.getInstance().publicarQuest(mensagem);
    }
}
