package src;

/**
 * Pedido, a compra do produto
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Pedido {

    private double valorTotal;
    private int qtdProdutos;

    
    public boolean baixaEstoque(ProdutoEspecifico item, int qtd) {
        if (item.getQtdEstoque() >= qtd ) {
            item.setQtdEstoque(-getQtdProdutos());
            this.pagamento(item, qtd);
            return true;
        }
        System.out.println("Produto Sem Estoque");
        return false;
        
    }
    
    protected void pagamento (ProdutoEspecifico item, int qtd) {
        setValorTotal(qtd * item.getPreco());
        System.out.print("Valor total: R$");
        System.out.println(getValorTotal());
    }

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

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQtdProdutos() {
        return qtdProdutos;
    }

    public void setQtdProdutos(int qtdProdutos) {
        this.qtdProdutos = qtdProdutos;
    }

}
