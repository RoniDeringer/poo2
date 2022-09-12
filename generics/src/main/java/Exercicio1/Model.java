package Exercicio1;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Model {

    private String texto;
    private int num;

    public Model(String texto, int num) {
        setTexto(texto);
        setNum(num);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Model [Texto=");
        builder.append(texto);
        builder.append(", num=");
        builder.append(num);
        builder.append("]");
        return builder.toString();
    }
}
