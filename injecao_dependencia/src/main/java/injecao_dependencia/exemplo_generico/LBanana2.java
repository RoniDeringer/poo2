/*
 * Com Warning
 * cast e add será verificado na execução
 */
package injecao_dependencia.exemplo_generico;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author roni.aviz
 */
public class LBanana2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Banana b = new Banana("Branca", "Brasil");
        
        list.add(b);
        Banana b1 = (Banana)list.get(0);
        System.out.println(b1.toString());
    }
}
