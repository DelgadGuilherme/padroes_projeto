package padroescriacao.factorymethod;

public class ContratoDesenvolvedor implements Contrato {
    public String contratar() { return "Contrato efetivado"; }
    public String imprimir() { return "Contrato de Desenvolvedor"; }
    public String demitir() { return "Contrato rescindido"; }
}
