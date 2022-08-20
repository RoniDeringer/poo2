package atendimento_medico;

/**
 *
 * @author Roni
 */
public class Medico extends Pessoa {
    
    protected Especialidade especialidade;

    
    public Medico(Especialidade especialidade, String nome, String dataNascimento) {
        this.especialidade = especialidade;
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
    
    
    
}
