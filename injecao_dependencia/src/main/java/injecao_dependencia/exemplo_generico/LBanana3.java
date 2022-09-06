package injecao_dependencia.exemplo_generico;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author roni.aviz
 */
public class LBanana3 {
     public static void main(String[] args) {
        List list = new ArrayList();
        Uva b = new Uva("Branca");
        
        list.add(b); 
        Banana b1 = (Banana)list.get(0); // add Uva na lista de Banana
        System.out.println(b1.toString());
    }
    
}
