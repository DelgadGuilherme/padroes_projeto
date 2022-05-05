package padroescomportamentais.observer;

import java.util.Observable;

public class Rastreio extends Observable {

    private String produto;
    private String enderecoEntrega;

    public Rastreio(String produto, String enderecoEntrega) {
        this.produto = produto;
        this.enderecoEntrega = enderecoEntrega;
    }

    public void alterarStatus(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return  this.produto;
    }
}
