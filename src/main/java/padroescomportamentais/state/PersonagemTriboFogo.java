package padroescomportamentais.state;

public class PersonagemTriboFogo implements Tribo{

    private PersonagemTriboFogo() {};
    private static PersonagemTriboFogo instance = new PersonagemTriboFogo();
    public static PersonagemTriboFogo getInstance() {
        return instance;
    }

    public String getTribo() {
        return "Tribo fogo";
    }

    public String dobrarAgua(Personagem personagem) {
        return "Dobra não realizada";
    }

    public String dobrarFogo(Personagem personagem) {
        return "Dobra realizada";
    }

    public String dobrarTerra(Personagem personagem) {
        return "Dobra não realizada";
    }

    public String dobrarAr(Personagem personagem) {
        return "Dobra não realizada";
    }
}
