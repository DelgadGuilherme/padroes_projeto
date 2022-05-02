package padroescomportamentais.state;

public class PersonagemTriboAvatar implements Tribo{

    private PersonagemTriboAvatar() {};
    private static PersonagemTriboAvatar instance = new PersonagemTriboAvatar();
    public static PersonagemTriboAvatar getInstance() {
        return instance;
    }

    public String getTribo() {
        return "Avatar";
    }

    public String dobrarAgua(Personagem personagem) {
        personagem.setTribo(PersonagemTriboAgua.getInstance());
        return "Dobra de agua realizada";
    }

    public String dobrarFogo(Personagem personagem) {
        personagem.setTribo(PersonagemTriboFogo.getInstance());
        return "Dobra de fogo realizada";
    }

    public String dobrarTerra(Personagem personagem) {
        personagem.setTribo(PersonagemTriboTerra.getInstance());
        return "Dobra de terra realizada";
    }

    public String dobrarAr(Personagem personagem) {
        personagem.setTribo(PersonagemTriboAr.getInstance());
        return "Dobra de ar realizada";
    }


}
