package injecao_dependencia.exemplo_generico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roni.aviz
 */
public class LBanana {

    public static void main(String[] args) {
        List<Banana> list = new ArrayList<Banana>();
        Banana b = new Banana("Branca", "Brasil");

        list.add(b);
        Banana bi = list.get(0);
        System.out.println(bi.toString());
    }
}
