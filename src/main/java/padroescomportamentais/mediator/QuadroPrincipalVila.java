package padroescomportamentais.mediator;

import padroescomportamentais.mediator.Quadro;

public class QuadroPrincipalVila implements Quadro {

    private static  QuadroPrincipalVila instancia = new QuadroPrincipalVila();

    private QuadroPrincipalVila() {}

    public static QuadroPrincipalVila getInstance() {return  instancia;}

    public String publicarNoticia(String mensagem) {
        return "Noticia publicada: " + mensagem;
    }
    public String publicarQuest(String mensagem) {
        return "Quest publicada: " + mensagem;
    }
}
