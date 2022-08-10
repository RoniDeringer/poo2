/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public abstract class ProdutoGenerico {

    private String codigoPai;
    private String nome;
    private double preco;
    private int qtdEstoque;
    protected Distribuidor distribuidor;

    public void aumentoEstoque(String codigoPai, int qtdProdutos, double valor) {

        // if se codigo pai ja existe, só aumentar, se nao cria novo
    }

    //toString:
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ProdutoGenerico [nome=");
        builder.append(nome);
        builder.append(", preco=");
        builder.append(preco);
        builder.append(", qtdEstoque=");
        builder.append(qtdEstoque);
        builder.append("]");
        return builder.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

}
