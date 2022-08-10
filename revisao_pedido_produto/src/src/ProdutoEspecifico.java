/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class ProdutoEspecifico extends ProdutoGenerico{
    
    private int id;
    private String cor;
    private float peso;

    
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ProdutoEspecifico[cor=");
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
    
    
}
