package atendimento_medico;

/**
 *
 * @author Roni
 */
public class Atestado {

    private int cid;

    public void emitirAtestado(Atendimento atendimento) {
        System.out.println("---ATESTADO---");
        System.out.println("inicio: " + atendimento.getInicio());
        System.out.println("fim: " + atendimento.getFim());
        
    }

    
    
    
    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    
    
    
    
}
