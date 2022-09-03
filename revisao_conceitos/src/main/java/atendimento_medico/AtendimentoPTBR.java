package atendimento_medico;

/**
 *
 * @author roni.aviz
 */
public class AtendimentoPTBR implements AtendimentoInterface {

    
        @Override
    public String calculaPrioridade() {
        return ("--PRIORIDADE---\n1 - Alto\n2 - Médio\n3 - Baixo");
    }

    @Override
    public String calculaEstado() {
        return ("--ESTADO---\n1 - Grave\n2 - Morto\n3 - Vivo!");
    }
}
