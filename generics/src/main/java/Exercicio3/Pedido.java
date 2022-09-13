package Exercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Pedido<T extends ProdutoX> {

    List<T> listProdutos = new ArrayList<T>();

    //add
    public void add(T produtoX) {
        listProdutos.add(produtoX);
    }

    //mostrar
    public List<T> viewProdutos() {
        return listProdutos;
    }
}
