package padroescomportamentais.state;

public class Personagem {

    private String nome;
    private Tribo tribo;

    public Personagem() {
        this.tribo = PersonagemTriboAvatar.getInstance();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tribo getTribo() {
        return tribo;
    }

    public void setTribo(Tribo tribo) {
        this.tribo = tribo;
    }

    public String dobrarAgua() {
        return tribo.dobrarAgua(this);
    }

    public String dobrarFogo() {
        return tribo.dobrarFogo(this);
    }

    public String dobrarTerra() {
        return tribo.dobrarTerra(this);
    }

    public String dobrarAr() {
        return tribo.dobrarAr(this);
    }
}
