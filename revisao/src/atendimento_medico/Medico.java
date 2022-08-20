package atendimento_medico;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
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

    @Override
    public String toString() {
        return "Medico{" + "especialidade=" + especialidade + '}';
    }
    
    
    
}
