package padroesestruturais.flyweight;

public class Personagem {

    private String nome;
    private Raca raca;

    public Personagem(String nome, Raca raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String obterPersonagem() {
        return "Personagem {" +
                "nome='" + this.nome + '\'' +
                ", raca='" + raca.getNome() + '\'' +
                ", regiao='" + raca.getRegiao() + '\'' +
                '}';
    }
}
