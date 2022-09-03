/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class ProdutoGenerico {

    private String codigoPai;
    private String nome;
    private double preco;
    private int qtdEstoqueGeral;
    protected Distribuidor distribuidor;


    //toString:
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n   ProdutoGenerico [nome=");
        builder.append(nome);
        builder.append(", preco=");
        builder.append(preco);
        builder.append(", qtdEstoque=");
        builder.append(qtdEstoqueGeral);
        builder.append("");
        builder.append(distribuidor);
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

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoqueGeral() {
        return qtdEstoqueGeral;
    }

    public void setQtdEstoqueGeral(int qtdEstoqueGeral) {
        this.qtdEstoqueGeral = qtdEstoqueGeral + getQtdEstoqueGeral();
     }

    public String getCodigoPai() {
        return codigoPai;
    }

    public void setCodigoPai(String codigoPai) {
        this.codigoPai = codigoPai;
    }

    public Distribuidor getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(Distribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }
    

}
