package atendimento_medico;

import java.util.Date;

/**
 *
 * @author Roni
 */
public abstract class Pessoa {

    private Date dataNascimento;
    private String nome;

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
