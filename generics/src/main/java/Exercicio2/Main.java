package Exercicio2;

/**
 *
 * @author Roni
 */
public class Main {

    public static void main(String[] args) {

        Produto<Integer> integer = new Produto<Integer>(1);
        Produto<String> string = new Produto<String>("Um");

        System.out.println(integer.get());
        System.out.println(string.get());
    }
}
