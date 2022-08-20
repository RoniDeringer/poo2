package atendimento_medico;

/**
 *
 * @author Roni
 */
public class Medico extends Pessoa {
    
    protected Especialidade especialidade;
    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
    
    
    
}
