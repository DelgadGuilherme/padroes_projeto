package padroescomportamentais.memento;

public class PersonagemTriboAgua implements Tribo {

    private PersonagemTriboAgua() {};
    private static PersonagemTriboAgua instance = new PersonagemTriboAgua();
    public static PersonagemTriboAgua getInstance() {
        return instance;
    }

    public String getTribo() {
        return "Tribo agua";
    }

    public String dobrarAgua(Personagem personagem) {
        return "Dobra realizada";
    }

    public String dobrarFogo(Personagem personagem) {
        return "Dobra não realizada";
    }

    public String dobrarTerra(Personagem personagem) {
        return "Dobra não realizada";
    }

    public String dobrarAr(Personagem personagem) {
        return "Dobra não realizada";
    }
}
