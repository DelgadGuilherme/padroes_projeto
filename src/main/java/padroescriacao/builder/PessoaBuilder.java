package padroescriacao.builder;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PessoaBuilder {

    private Pessoa pessoa;

    public PessoaBuilder() {
        pessoa = new Pessoa();
    }

    public Pessoa build() {

       if (pessoa.getNome().equals("")) {
           throw new IllegalArgumentException("Nome invalido");
       }
       if (pessoa.getEmail().equals("")){
           throw new IllegalArgumentException("Email invalido");
       }

       return pessoa;
    }

    public PessoaBuilder setNome(String nome) {
        pessoa.setNome(nome);
        return this;
    }

    public PessoaBuilder setDataNascimento(Date dataNascimento) {
        pessoa.setDataNascimento(dataNascimento);
        return this;
    }

    public PessoaBuilder setGenero(String genero) {
        pessoa.setGenero(genero);
        return this;
    }

    public PessoaBuilder setEndereco(String endereco) {
        pessoa.setEndereco(endereco);
        return this;
    }

    public PessoaBuilder setCelular(String celular) {
        pessoa.setCelular(celular);
        return this;
    }

    public PessoaBuilder setEmail(String email) {
        pessoa.setEmail(email);
        return this;
    }

    public PessoaBuilder setCor(String cor) {
        pessoa.setCor(cor);
        return this;
    }

    public PessoaBuilder setNomeMae(String nomeMae) {
        pessoa.setNomeMae(nomeMae);
        return this;
    }



}
