package Exercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Controller<T> {

    List<Model<T>> listModel = new ArrayList<Model<T>>();

    //retorna o objeto unico dentro da lista
    public Model<T> get(String key) {
        for (Model<T> model : listModel) {
            if (model.getKey() == key) {
                return model;
            }
        }
        return null;
    }

    //chave nao pode ser nula
    public boolean add(String key, T value) {
        if (get(key) == null) {
            listModel.add(new Model<T>(key, value));
            return true;
        }
        return false;
    }
}
