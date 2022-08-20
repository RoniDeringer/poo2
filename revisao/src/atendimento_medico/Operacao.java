package atendimento_medico;

import java.util.Date;

/**
 *
 * @author Roni
 */
public class Operacao {


    

    private Date inicio;
    private Date fim;

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public Date tempoTotal() {
        System.out.println("Início: " + this.getInicio());
        System.out.println("Fim: " + this.getFim());
        System.out.println("Tempo Total: ");

        return this.getInicio();
    }

    
    
    
    
    
    
    
    
    
    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

}
