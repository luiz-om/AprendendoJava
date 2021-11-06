package br.com.azi.aprendendojava.dominio;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
@Data @Log4j2
public class Colecionador {

    private String nome;
    private List<Item> colecao;

    public Colecionador(String nome) {
        this.nome = nome;
        colecao =  new ArrayList<Item>();
    }
}
