package Exercicio3;

/**
 *
 * @author Roni
 */
public class ProdutoX {

    private int id;
    private String nome;

    public ProdutoX(int id, String nome) {
        setId(id);
        setNome(nome);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        builder.append("ProdutoX [id=");
        builder.append(id);
        builder.append(", nome=");
        builder.append(nome);
        builder.append("]");
        return builder.toString();
    }
}
