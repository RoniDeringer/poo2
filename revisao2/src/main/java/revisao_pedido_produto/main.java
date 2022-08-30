package src;

import revisao_pedido_produto.Pedido;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class main {

    public static void main(String[] args) {

        Distribuidor dist1 = new Distribuidor("Renner", "Roupa", 50.00);
        
        
        ProdutoGenerico camisa = new ProdutoGenerico();
        camisa.setCodigoPai("CAM-30");
        camisa.setNome("Camisa");
        camisa.setPreco(89.90);
        camisa.setDistribuidor(dist1);  //agregação 

        ProdutoEspecifico prod1 = new ProdutoEspecifico();
        prod1.setCodigoPai(camisa.getCodigoPai());
        prod1.setNome(camisa.getNome());
        prod1.setPreco(camisa.getPreco());
        prod1.setDistribuidor(camisa.getDistribuidor());
        prod1.setId(31);
        prod1.setCor("Vermelho");
        prod1.setPeso(0.4f);
        prod1.setQtdEstoque(5);

        ProdutoEspecifico prod2 = new ProdutoEspecifico();
        prod2.setCodigoPai(camisa.getCodigoPai());
        prod2.setNome(camisa.getNome());
        prod2.setPreco(camisa.getPreco());
        prod2.setDistribuidor(camisa.getDistribuidor());
        prod2.setId(32);
        prod2.setCor("Verde");
        prod2.setPeso(0.4f);
        prod2.setQtdEstoque(2);
        
        
        Pedido compra1 = new Pedido(prod1);
        compra1.addProduto(prod2);
        
        
        System.out.println(compra1);
        
      
        
    }
}
