package atendimento_medico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Operacao {

    private Date inicio;
    private Date fim;

   

    public Date tempoTotal() {
        System.out.println("Início: " + this.getInicio());  //retorna milisegundos
        System.out.println("Fim: " + this.getFim());
        System.out.println("Tempo Total: ");

        return this.getInicio();
    }
    
    private void diferencaTempo(){
//        teste = this.getFim() - this.getInicio();
    }
    
    

    public Date getInicio() {
        return inicio;
    }

    //só vai ser utilizado caso alterar a data !
    public void setInicio(String inicio) {
        try {
            this.inicio = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(inicio);
        } catch (ParseException ex) {
            Logger.getLogger(Operacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Date getFim() {
        return fim;
    }

    //só vai ser utilizado caso alterar a data !
    public void setFim(String fim) {
        try {
            this.fim = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(fim);
        } catch (ParseException ex) {
            Logger.getLogger(Operacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
