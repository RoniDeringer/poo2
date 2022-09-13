package Exercicio2;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        Produto<Integer> integer = new Produto<Integer>(1);
        Produto<String> string = new Produto<String>("Um");

        System.out.println(integer);
        System.out.println(string);
    }
}
