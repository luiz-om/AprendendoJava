package br.com.azi.aprendendojava.dominio;

public class Item {
    private String nome;
    private int anoCriacao;

    //Construtor vazio
    public Item() {

    }
    //Construtor com parametros
    public Item(String _nome, int _anoCriacao) {
        this.nome = _nome;
        this.anoCriacao = _anoCriacao;
    }
}
