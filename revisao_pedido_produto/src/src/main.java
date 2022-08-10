package src;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class main {
    public static void main(String[] args) {
        
   Distribuidor dist1 = new Distribuidor();
   dist1.setNome("Renner");
   dist1.setTipo("Roupa");
   dist1.setPreco(50.00);
        
        
    ProdutoEspecifico prod1 = new ProdutoEspecifico();
    prod1.setCodigoPai("CAM-30");
    prod1.setNome("Camisa");
    prod1.setPreco(89.90);
    prod1.setQtdEstoque(10);
    prod1.setDistribuidor(dist1);
    prod1.setId(31);
    prod1.setCor("Vermelho");
    prod1.setPeso(0.4f);
    
    
    
    
    }
}
