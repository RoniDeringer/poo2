package atendimento_medico;

/**
 *
 * @author Roni
 */
public class Especialidade {

    private String descricao;

    public Especialidade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return " Especialidade{" + "descricao=" + descricao + '}';
    }
}
