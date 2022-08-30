package atendimento_medico;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Paciente extends Pessoa {

     public Paciente(String nome, String dataNascimento) {
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
    }

     @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nPaciente[");
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }
}
