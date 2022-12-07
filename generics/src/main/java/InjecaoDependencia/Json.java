package InjecaoDependencia;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Json implements FormatType {

    @Override
    public String converte(Aluno object) {
        String json = new com.google.gson.Gson().toJson(object);
        return json;
    }
}
