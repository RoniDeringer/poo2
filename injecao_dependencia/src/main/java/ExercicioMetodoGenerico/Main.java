package ExercicioMetodoGenerico;

/**
 *
 * @author roni.aviz
 */
public class Main {
    public static void main(String[] args) {
        Integer[] meuArray = {1,2,3,4,5};
        Integer valor = 3;
        int cont = Comp2.<Integer>countGreaterThan(meuArray, valor);
        System.out.println(cont);
    }
}
