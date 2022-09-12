package Exercicio2;

/**
 *
 * @author Roni
 */
public class Produto<T> {

    private T id;

    public Produto(T id) {
        setId(id);
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public T get() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Produto [id=");
        builder.append(id);
        builder.append("]");
        return builder.toString();
    }
}
