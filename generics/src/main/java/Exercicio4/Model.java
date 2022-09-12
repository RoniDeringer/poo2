package Exercicio4;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Model<T> {

    public String key;
    public T value;

    public Model(String key, T value) {
        setValue(value);
        setKey(key);
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
}
