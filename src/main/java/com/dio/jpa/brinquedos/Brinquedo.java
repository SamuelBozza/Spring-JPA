package com.dio.jpa.brinquedos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Brinquedo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cor;
    private int tamanho;

    public Brinquedo() {

    }

    public Brinquedo(Long id, String nome, String cor, int tamanho) {
        this.id = id;
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public Brinquedo(String nome, String cor, int tamanho) {
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
