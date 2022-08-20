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

    public Atendimento(Paciente paciente, String inicio, String fim) {
        this.setInicio(inicio);
        this.setFim(fim);
        this.calculaPrioridade();
        this.setEstado(estado);
        this.medico = medico;
        this.paciente = paciente;
    }

    
    
    public void calculaPrioridade() {
        System.out.println("--PRIORIDADE---");
        System.out.println("1 - Alto");
        System.out.println("2 - Médio");
        System.out.println("3 - Baixo");
        
        Scanner s = new Scanner (System.in);
        this.prioridade = s.nextInt();
    }
    
    public void calculaEstado() {
        System.out.println("--ESTADO---");
        System.out.println("1 - Ferido");
        System.out.println("2 - Morto");
        System.out.println("3 - Mertiolate Resolve!");
        
        Scanner s = new Scanner (System.in);
        this.estado = s.nextInt();
    }

    public Atendimento(int prioridade, int estado, Paciente paciente) {
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

    @Override
    public String toString() {
        return "Atendimento{" + "prioridade=" + prioridade + ", estado=" + estado + ", medico=" + medico + ", paciente=" + paciente + '}';
    }
    
    

}
