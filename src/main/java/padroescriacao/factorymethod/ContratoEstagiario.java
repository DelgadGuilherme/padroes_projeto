package padroescriacao.factorymethod;

public class ContratoEstagiario implements Contrato {
    public String contratar() { return "Contrato efetivado"; }
    public String imprimir() { return "Contrato de estagiario"; }
    public String demitir() { return "Contrato rescindido"; }
}
