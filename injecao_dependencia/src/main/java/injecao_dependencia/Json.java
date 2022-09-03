package injecao_dependencia;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Json implements FormatType{

    @Override
    public String imprima(Aluno object) {
    
        String json = new com.google.gson.Gson().toJson(object);
        return json;
    }
}
