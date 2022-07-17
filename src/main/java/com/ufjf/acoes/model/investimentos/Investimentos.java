/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufjf.acoes.model.investimentos;

/**
 *
 * @author yanfo
 */
public class Investimentos {
    private static int idAtual = 0;
    private String nome;
    private int id;
    private String quantidade;
    private String preco;

    public Investimentos(String nome, String quantidade, String preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.id = idAtual++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
