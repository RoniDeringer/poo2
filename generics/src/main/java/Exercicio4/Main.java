package Exercicio4;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Main {
    public static void main(String[] args) {

        Model<String> model = new Model<>();
        
        model.add("1", "99");
        model.add("2", "88");

        System.out.print(model.get("1"));
        System.out.print(model.get("2"));
    }
}
