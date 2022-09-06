package injecao_dependencia.exemplo_generico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roni.aviz
 */
public class LBanana4 {

    public static void main(String[] args) {
        List<Banana> list = new ArrayList<Banana>();
        Uva b = new Uva("Branca");
//        list.add(b);   //ERRRO
        Banana b1 = (Banana) list.get(0);
        System.out.println(b1.toString());
    }
}
