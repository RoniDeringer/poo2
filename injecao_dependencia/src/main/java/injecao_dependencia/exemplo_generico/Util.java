package injecao_dependencia.exemplo_generico;

import java.util.Arrays;

/**
 * Criação do metodo estatico a definicao dos parametros p1 e p2 só é valida pq
 * apos o static esta sendo passado a dupla K e V para definicao dos tipos as
 * quais pertence V e K
 *
 * @author roni.aviz
 */
public class Util {

    public static <K, V> boolean
            compare(Pair<K, V> p1, Pair<K, V> p2) {

        return p1.getKey().equals(p2.getKey())
                && p1.getValue().equals(p2.getValue());

    }
}
