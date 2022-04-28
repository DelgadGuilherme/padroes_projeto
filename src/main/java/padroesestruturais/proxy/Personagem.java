package padroesestruturais.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Personagem implements IPersonagem {

    private Integer codigoGuilda;
    private boolean mestre;
    private String nome;
    private String vida;
    private String forca;
    private String habilidade;

    public Personagem(int codigoGuilda){
        this.codigoGuilda = codigoGuilda;
        Personagem objeto =  DB.getPersonagem(codigoGuilda);
        this.mestre = objeto.mestre;
        this.vida = objeto.vida;
        this.nome = objeto.nome;
        this.forca = objeto.forca;
        this.habilidade = objeto.habilidade;
    }
    public Personagem(boolean mestre, Integer codigoGuilda, String nome, String vida, String forca, String habilidade) {
        this.mestre = mestre;
        this.codigoGuilda = codigoGuilda;
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.habilidade = habilidade;
    }

    public Integer getCodigoGuilda() {
        return codigoGuilda;
    }

    public boolean isMestre() {
        return mestre;
    }

    public void setMestre(Boolean mestre) {
        this.mestre = mestre;
    }

    @Override
    public List<String> obterDados() {
        return Arrays.asList(this.nome, this.vida);
    }

    @Override
    public List<String> obterStatus(Personagem personagem) {
        return Arrays.asList(this.forca, this.habilidade);
    }
}
