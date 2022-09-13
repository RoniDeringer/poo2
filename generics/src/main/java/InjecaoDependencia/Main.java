package InjecaoDependencia;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
      /**
         * ALUNO
         */
        Aluno aluno1 = new Aluno("Renato", 19);

        /**
         * FORMATOS
         */
        Xml xml = new Xml();
        Json json = new Json();

        
        aluno1.imprima(xml);
        aluno1.imprima(json);
    }        
}
