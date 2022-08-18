/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class ProdutoEspecifico extends ProdutoGenerico {

    private int id;
    private String cor;
    private float peso;
    private int qtdEstoque;

    public void aumentoEstoque(int qtdProdutos) {
        System.out.println("Valor da reposição de peças: R$ ");
        System.out.print(qtdProdutos * distribuidor.getPreco());
        setQtdEstoque(qtdProdutos);
        System.out.println("Estoque Atual: ");
        System.out.print(getQtdEstoque());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n  ProdutoEspecifico[id=");
        builder.append(id);
        builder.append(", cor=");
        builder.append(cor);
        builder.append(", peso=");
        builder.append(peso);
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;

        //mantém sempre atualizado o estoque Geral
        this.setQtdEstoqueGeral(qtdEstoque);    
        
    }
}
