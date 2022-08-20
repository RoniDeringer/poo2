package atendimento_medico;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Atestado extends Operacao {
    //inutil extender Operacao, já que já tenho acesso 
    //pelo relacionamento de (Atendimento extends Operacao)

    private int cid;

    public void emitirAtestado(Atendimento atendimento) {
        System.out.println("---ATESTADO---");
        System.out.println("inicio: " + atendimento.getInicio());
        System.out.println("fim: " + atendimento.getFim());
        System.out.println("Ass: Dr. " + atendimento.medico.getNome());

    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

}
