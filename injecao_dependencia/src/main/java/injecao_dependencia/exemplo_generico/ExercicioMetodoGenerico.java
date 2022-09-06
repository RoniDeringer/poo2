package injecao_dependencia.exemplo_generico;

/**
 *Escreva um método Genérico que conte o número de elementos em um array T[]
 * que sejam maiores que um elemento E, onde os tipos de T[] e E são iguais
 * @author roni.aviz
 */
public class ExercicioMetodoGenerico {
   
    
    public static <K, V> boolean
            compare(Pair<K, V> p1, Pair<K, V> p2) {

        return p1.getKey().equals(p2.getKey())
                && p1.getValue().equals(p2.getValue());

    }
}