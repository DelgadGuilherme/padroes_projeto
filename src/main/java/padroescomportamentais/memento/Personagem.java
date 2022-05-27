package padroescomportamentais.memento;

import java.util.ArrayList;
import java.util.List;

public class Personagem {

    private String nome;
    private Tribo tribo;
    private List<Tribo> memento = new ArrayList<>();

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
        return this.tribo;
    }

    public void setTribo(Tribo tribo) {
        this.tribo = tribo;
        this.memento.add(this.tribo);
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

    public void restauraTribo(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.tribo = this.memento.get(indice);
    }

    public List<Tribo> getTribos() {
        return this.memento;
    }
}
