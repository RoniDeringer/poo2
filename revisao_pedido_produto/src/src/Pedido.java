package src;

/**
 * Pedido, a compra do produto
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Pedido {

    private float valorTotal;
    private int qtdProdutos;

//    public boolean baixaEstoque(ProdutoEspecifico item) {
//    }

    //toString:
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pedido [valorTotal=");
        builder.append(valorTotal);
        builder.append(", qtdProdutos=");
        builder.append(qtdProdutos);
        builder.append("]");
        return builder.toString();
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQtdProdutos() {
        return qtdProdutos;
    }

    public void setQtdProdutos(int qtdProdutos) {
        this.qtdProdutos = qtdProdutos;
    }

}
