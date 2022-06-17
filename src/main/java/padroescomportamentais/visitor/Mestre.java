package padroescomportamentais.visitor;

public class Mestre implements Personagem {

    private String nome;
    private String raça;

    public Mestre( String nome, String raça) {
        this.nome = nome;
        this.raça = raça;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirMestre(this);
    }
}
