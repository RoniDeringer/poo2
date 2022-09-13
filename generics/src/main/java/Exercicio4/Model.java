package Exercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Model<T> {

    public String key;
    public T value;

    public Model(String key, T value) {
        setKey(key);
        setValue(value);
    }
    
    
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Model [key=");
        builder.append(key);
        builder.append(", value=");
        builder.append(value);
        builder.append("]");
        return builder.toString();

    }
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
