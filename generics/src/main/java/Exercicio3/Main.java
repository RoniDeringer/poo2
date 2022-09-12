package Exercicio3;

/**
 *
 * @author Roni
 */
public class Main {

    public static void main(String[] args) {

        Pedido<ProdutoX> pedido = new Pedido<ProdutoX>();

        //add
        pedido.add(new ProdutoX(1, "Produto1"));
        pedido.add(new ProdutoX(2, "Produto2"));

        //mostrar
        System.out.println(pedido.viewProdutos());
    }
}
