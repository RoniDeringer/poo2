package atendimento_medico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public void setFim(Date fim) {
        this.fim = fim;
    }

}
