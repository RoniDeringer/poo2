package Exercicio1;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Objeto {

    private String nome;

    public Objeto(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Model [Nome=");
        builder.append(nome);
        builder.append("]");
        return builder.toString();
    }
}
