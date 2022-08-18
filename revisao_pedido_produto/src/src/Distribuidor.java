package src;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 *
 */
public class Distribuidor {

    private String nome;
    private String tipo;
    private double preco;

    public Distribuidor(String nome, String tipo, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }





    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n        Distribuidor[nome=");
        builder.append(nome);
        builder.append(", tipo=");
        builder.append(tipo);
        builder.append(", preco=");
        builder.append(preco);
        builder.append("]");
        return builder.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
