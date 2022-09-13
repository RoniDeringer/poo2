package Exercicio1;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        Pessoa objeto = new Pessoa("teste");
        int inteiro = 1;
        String stringui = "texto";
        

        ClasseGenerica<Object> cgObjeto = new ClasseGenerica<Object>(objeto);
        ClasseGenerica<Integer> cgInteiro = new ClasseGenerica<Integer>(inteiro);
        ClasseGenerica<String> cgString = new ClasseGenerica<String>(stringui);
        
        
        //toString()
        System.out.println("\n objeto:");
        System.out.println(cgObjeto);
        
        System.out.println("\n Inteiro:");
        System.out.println(cgInteiro);
        
        System.out.println("\n String:");
        System.out.println(cgString);
        
        
        
        TypeTester t = new TypeTester();
        System.out.println("\n");
        t.printType(cgObjeto.getAtributoGenerico());
        t.printType(cgInteiro.getAtributoGenerico());
        t.printType(cgString.getAtributoGenerico());

    }
}
