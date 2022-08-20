package atendimento_medico;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Atendimento extends Operacao {

    private int prioridade;
    private int estado;
    protected Medico medico;
    protected Paciente paciente;

    public void calculaPrioridade(boolean prioridades[]) {
    }

    public Atendimento(int prioridade, int estado, Paciente paciente, Medico medico) {
        this.prioridade = prioridade;
        this.estado = estado;
        this.paciente = paciente; // composição
        //medico é agregação, não precisa ter
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
