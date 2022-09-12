package Exercicio4;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Main {
   	public static void main(String[] args) {


		Controller<String> controller = new Controller<>();
		controller.add("1", "99");
		controller.add("2", "88");
		
		System.out.print(controller.get("1"));
		System.out.print(controller.get("2"));
	} 
}
