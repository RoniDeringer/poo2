package atendimento_medico;

import java.util.Calendar;

/**
 *
 * @author Roni
 */
public class TestData {

    public static void main(String[] args) {

        Calendar hoje = Calendar.getInstance();

        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int mes = hoje.get(Calendar.MONTH);
        int ano = hoje.get(Calendar.YEAR);
        System.out.printf("Data: %02d/%02d/%d ", dia, (mes + 1), ano);

        
        
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);
        System.out.printf("\nHora: %d:%d:%d ", hora, minutos, segundos);
        
        
        System.out.printf("\nHorario completo: %02d/%02d/%d %02d:%02d:%02d",
                dia, (mes + 1), ano, hora, minutos, segundos);
        
        System.out.println("");
        
        
        /**
         * CONSIGO AUMENTAR dias/meses
         * a partir da data que ja tenho
         * exemplo: data atual mais 1 dia 
         */
        hoje.add(Calendar.DAY_OF_MONTH, -1);
        System.out.print("dia anterior: ");
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
        
    }

}
