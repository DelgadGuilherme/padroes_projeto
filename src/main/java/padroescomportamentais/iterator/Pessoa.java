package padroescomportamentais.iterator;

public class Pessoa {

    private String nome;
    private String bairro;
    private boolean vacinado;

    public Pessoa(String nome, String bairro, boolean vacinado) {
        this.nome = nome;
        this.bairro = bairro;
        this.vacinado = vacinado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }
}
