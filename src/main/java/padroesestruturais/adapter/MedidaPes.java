package padroesestruturais.adapter;

public class MedidaPes implements  IMedida{

    private float pes;

    @Override
    public float getMedida() {
        return this.pes;
    }

    @Override
    public  void setMedida(float pes) {
        this.pes = pes;
    }

}
