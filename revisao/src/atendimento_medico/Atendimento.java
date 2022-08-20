package atendimento_medico;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
*/
public class Atendimento extends Operacao{
    
    private int prioridade;
    private int estado;
    protected Medico medico;
    protected Paciente paciente;
    
    
    
    public void calculaPrioridade(boolean  prioridades[]){
        
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
    
    
    
    
    
}