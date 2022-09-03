package atendimento_medico;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
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
         * CONSIGO AUMENTAR dias/meses a partir da data que ja tenho exemplo:
         * data atual mais 1 dia
         */
        hoje.add(Calendar.DAY_OF_MONTH, -1);
        System.out.print("dia anterior: ");
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));

        System.out.println("------------------");
        System.out.println("RECEBENDO DATAS E FORMATANDO");
        System.out.println("------------------");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        
        
        String inicio = "01/01/2020";
        Calendar dataInicio = Calendar.getInstance();
        try {
            dataInicio.setTime(sdf2.parse(inicio));
            System.out.println("Data de Inicio: " + sdf2.format(dataInicio.getTime()));

        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }

            System.out.println(dataInicio.getClass());

        
        
        
    }

}
