package padroescomportamentais.state;

public class PersonagemTriboAr implements Tribo{

    private PersonagemTriboAr() {};
    private static PersonagemTriboAr instance = new PersonagemTriboAr();
    public static PersonagemTriboAr getInstance() {
        return instance;
    }

    public String getTribo() {
        return "Tribo ar";
    }

    public String dobrarAgua(Personagem personagem) {
        return "Dobra não realizada";
    }

    public String dobrarFogo(Personagem personagem) {
        return "Dobra não realizada";
    }

    public String dobrarTerra(Personagem personagem) {
        return "Dobra não realizada";
    }

    public String dobrarAr(Personagem personagem) {
        return "Dobra realizada";
    }
}
