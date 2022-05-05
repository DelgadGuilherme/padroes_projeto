package padroescomportamentais.observer;

import java.util.Observable;
import java.util.Observer;

public class Pessoa implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void rastrear(Rastreio rastreio) {
        rastreio.addObserver(this);
    }

    public void update(Observable rastreio, Object arg) {
        this.ultimaNotificacao = this.nome + " Atualizacao no transporte de " + rastreio.toString();
    }
}
