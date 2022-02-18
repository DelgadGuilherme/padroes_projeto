package padroescriacao.singleton;

public class Parametros {

    private Parametros() {};
    private static Parametros instance = new Parametros();
    static Parametros getInstance() { return instance; }

    private String nomeImpressora;
    private String ipImpressora;
    private String senhaImpressora;

    public String getNomeImpressora() {
        return nomeImpressora;
    }

    public void setNomeImpressora(String nomeImpressora) {
        this.nomeImpressora = nomeImpressora;
    }

    public String getIpImpressora() {
        return ipImpressora;
    }

    public void setIpImpressora(String ipImpressora) {
        this.ipImpressora = ipImpressora;
    }

    public String getSenhaImpressora() {
        return senhaImpressora;
    }

    public void setSenhaImpressora(String senhaImpressora) {
        this.senhaImpressora = senhaImpressora;
    }
}
