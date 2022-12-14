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
    protected AtendimentoInterface atendimentoInterface;

    public Atendimento(Paciente paciente, AtendimentoInterface atendimentoInterface) {
        this.medico = medico;
        this.paciente = paciente;
        this.calculaPrioridade(atendimentoInterface);
        this.calculaEstado(atendimentoInterface);
    }

    public void calculaPrioridade(AtendimentoInterface atendimentoInterface) {
        System.out.println(atendimentoInterface.calculaPrioridade());
        Scanner s = new Scanner(System.in);
        this.prioridade = s.nextInt();
    }

    public void calculaEstado(AtendimentoInterface atendimentoInterface) {
         System.out.println(atendimentoInterface.calculaEstado());

        Scanner s = new Scanner(System.in);
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
        StringBuilder builder = new StringBuilder();
        builder.append("\n------------");
        builder.append("\nAtendimento[prioridade=");
        builder.append(prioridade);
        builder.append(", estado=");
        builder.append(estado);
        builder.append(medico);
        builder.append(paciente);
        builder.append("]");
        return builder.toString();
    }

}
