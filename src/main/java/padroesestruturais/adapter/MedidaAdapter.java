package padroesestruturais.adapter;

public class MedidaAdapter extends MedidaCM{

    private IMedida medidaPes;

    public MedidaAdapter(IMedida medidaPes) {
        this.medidaPes = medidaPes;
    }

    public float recuperaMedida() {
        medidaPes.setMedida(this.getCm() * 0.032f);
        return medidaPes.getMedida();

    }

    public void salvarMedida() {
        this.setCm(medidaPes.getMedida() / 0.032f);
    }
}
