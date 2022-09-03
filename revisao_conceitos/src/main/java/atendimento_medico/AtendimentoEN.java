package atendimento_medico;

/**
 *
 * @author roni.aviz
 */
public class AtendimentoEN implements AtendimentoInterface {

    @Override
    public String calculaPrioridade() {
        return ("--PRIORIDADE---\n1 - High\n2 - Medium\n3 - Low");
    }

    @Override
    public String calculaEstado() {
        return ("--ESTADO---\n1 - Injured\n2 - Dead\n3 - Alive!");
    }

}
