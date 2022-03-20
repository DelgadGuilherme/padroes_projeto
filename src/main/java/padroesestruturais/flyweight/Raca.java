package padroesestruturais.flyweight;

public class Raca {

    public String nome;
    public String regiao;

    public Raca(String nome, String regiao) {
        this.nome = nome;
        this.regiao = regiao;
    }

    public String getNome() {
        return nome;
    }

    public String getRegiao() {
        return regiao;
    }
}
