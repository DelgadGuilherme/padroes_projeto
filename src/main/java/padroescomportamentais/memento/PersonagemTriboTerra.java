package padroescomportamentais.memento;

public class PersonagemTriboTerra implements Tribo {

    private PersonagemTriboTerra() {};
    private static PersonagemTriboTerra instance = new PersonagemTriboTerra();
    public static PersonagemTriboTerra getInstance() {
        return instance;
    }

    public String getTribo() {
        return "Tribo terra";
    }

    public String dobrarAgua(Personagem personagem) {
        return "Dobra não realizada";
    }

    public String dobrarFogo(Personagem personagem) {
        return "Dobra não realizada";
    }

    public String dobrarTerra(Personagem personagem) {
        return "Dobra realizada";
    }

    public String dobrarAr(Personagem personagem) {
        return "Dobra não realizada";
    }
}
