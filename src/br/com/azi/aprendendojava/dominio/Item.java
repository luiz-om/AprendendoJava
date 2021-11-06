package br.com.azi.aprendendojava.dominio;

import lombok.Data;

@Data
public class Item {
    private String nome;
    private int anoCriacao;

    //Construtor com parametros
    public Item(String _nome, int _anoCriacao) {
        this.nome = _nome;
        this.anoCriacao = _anoCriacao;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", anoCriacao=" + anoCriacao +
                '}';
    }
}
