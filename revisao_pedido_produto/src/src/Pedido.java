package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Pedido, a compra do produto
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Pedido {

    protected List<ProdutoEspecifico> listProduto = new ArrayList<ProdutoEspecifico>();

    //construct
    public Pedido(ProdutoEspecifico item) {
        listProduto.add(item);
    }

    //add produto na lista
    public void addProduto(ProdutoEspecifico item) {
        listProduto.add(item);
    }
    
       @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nPedido[Produtos=");
        builder.append(listProduto);
        builder.append("]\n");
        return builder.toString();
    }
    
    

    public List getListProduto() {
        return listProduto;
    }

    public void setListProduto(List listProduto) {
        this.listProduto = listProduto;
    }

}
