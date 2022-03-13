package padroescriacao.prototype;

public class Sessao implements Cloneable {
    private String filme;
    private String horario;
    private double valor;
    private String sala;

    public Sessao(String filme, String horario, double valor, String sala) {
        this.filme = filme;
        this.horario = horario;
        this.valor = valor;
        this.sala = sala;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public Sessao clone() throws CloneNotSupportedException {
        Sessao sessaoClone = (Sessao) super.clone();
        sessaoClone.sala = (String) sessaoClone.sala.clone();
        return sessaoClone;
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "filme=" + filme +
                ", horario='" + horario + '\'' +
                ", valor=" + valor +
                ", sala='" + sala + '\'' +
                '}';
    }

}
