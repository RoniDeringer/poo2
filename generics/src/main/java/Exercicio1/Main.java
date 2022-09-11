package Exercicio1;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        Model object = new Model("Test String", 123);

        ListModel<String> string = new ListModel<String>();
        ListModel<Integer> integer = new ListModel<Integer>();
        ListModel<Model> model = new ListModel<Model>();

        integer.add(Integer.valueOf(54321));
        string.add(new String("texto"));
        model.add(object);

        TypeTester t = new TypeTester();

        t.printType(object);
        t.printType(integer);
        t.printType(string);

    }
}
