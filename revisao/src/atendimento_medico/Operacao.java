package atendimento_medico;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Roni
 */
public class Operacao{


    

    private Date inicio;
    private Date fim;

    
    
    
    
    /**
     * formato esperado: string = 31/12/2021 15:25:60
     * @param dataString
     * @return Date
     */
//    private void convertData(String dataString) {
//
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//
//        Calendar dataFormat = Calendar.getInstance();
//
//        try {
//            return dataFormat.setTime(sdf.parse(dataString));
//
//        } catch (Exception e) {
//            System.out.println("Erro: " + e.getMessage());
//        }
//    }


    
    
    
    
    
    
    
    
    
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
