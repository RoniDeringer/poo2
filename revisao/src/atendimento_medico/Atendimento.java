package atendimento_medico;

import java.util.Scanner;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Atendimento extends Operacao {

    private int prioridade;
    private int estado;
    protected Medico medico;
    protected Paciente paciente;

    public Atendimento(int prioridade, int estado, Medico medico, Paciente paciente, String inicio, String fim) {
        this.setInicio(inicio);
        this.setFim(fim);
        this.setPrioridade(prioridade);
        this.setEstado(estado);
        this.medico = medico;
        this.paciente = paciente;
    }

    
    
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
        
        System.out.println("--PRIORIDADE---");
        System.out.println("1 - Alto");
        System.out.println("2 - Médio");
        System.out.println("3 - Baixo");
        
        Scanner s = new Scanner (System.in);
        this.prioridade = s.nextInt();
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        System.out.println("--ESTADO---");
        System.out.println("1 - Ferido");
        System.out.println("2 - Morto");
        System.out.println("3 - Mertiolate Resolve!");
        
        Scanner s = new Scanner (System.in);
        this.estado = s.nextInt();
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
