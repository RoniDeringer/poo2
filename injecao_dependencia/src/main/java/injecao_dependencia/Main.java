package injecao_dependencia;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        /**
         * ALUNO
         */
        Aluno aluno1 = new Aluno("Renato", "2018B123", "502.105.901-01", "30/08/1998", "renatinho@gmail.com");

        /**
         * FORMATOS
         */
        Xml xml = new Xml();
        Json json = new Json();

        
        aluno1.imprima(xml);
        aluno1.imprima(json);
    }
}