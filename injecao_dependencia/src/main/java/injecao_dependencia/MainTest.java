package injecao_dependencia;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class MainTest {

    public static void main(String[] args) {

        /**
         * ALUNOS
         */
        Aluno aluno1 = new Aluno("Renato", "2018B123", "502.105.901-01", "30/08/1998", "renatinho@gmail.com");
        Aluno aluno2 = new Aluno("Debora", "2018B123", "107.908.152-94", "01/12/2015", "marcio@yahoo.com");

        System.out.println("---------- toString()");
        System.out.println(aluno1);

        System.out.println("\n------ GSON - JSON");
        String jsonAluno = new Gson().toJson(aluno1);
        System.out.println(jsonAluno);

        System.out.println("\n------- XStream - XML");
        XStream stream = new XStream(new DomDriver());
        System.out.println(stream.toXML(aluno1));

    }
}
