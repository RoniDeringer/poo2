package src;

import revisao_pedido_produto.Pedido;

/**
 *
 * @author roni.aviz
 */
public class NotaFiscal {
 
    public void emitirNotaFiscal(Pedido item){
        System.out.println("NotaFiscal Emitida com sucesso!!");
        System.out.println(item);
    }
}
