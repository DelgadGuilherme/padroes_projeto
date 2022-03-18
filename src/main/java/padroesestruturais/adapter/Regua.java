package padroesestruturais.adapter;

public class Regua {

    IMedida medida;
    MedidaAdapter persistencia;

    public Regua() {
        medida = new MedidaPes();
        persistencia = new MedidaAdapter(medida);
    }

    public void setMedida(float valor) {
        medida.setMedida(valor);
        persistencia.salvarMedida();
    }

    public float getMedida() {
        return persistencia.recuperaMedida();
    }

    public float getMedidaCM() {
        return persistencia.getCm();
    }
}
