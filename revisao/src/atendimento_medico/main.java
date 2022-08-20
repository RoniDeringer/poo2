package atendimento_medico;

import java.time.Instant;
import java.util.Calendar;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class main {

    public static void main(String[] args) {

        /**
         * ESPECIALIDADES
         */
        Especialidade coracao = new Especialidade("Cardiologista");
        Especialidade crianca = new Especialidade("Pediatria ");
        Especialidade olho = new Especialidade("Oftalmologista");

        
        /**
         * MEDICOS:
         */
        Medico med1 = new Medico(coracao, "Alberto", "01/01/1990");
        Medico med2 = new Medico(crianca, "Enzo", "30/08/2000");
        Medico med3 = new Medico(olho, "Jorge", "15/10/1970");
        
        /**
         * PACIENTES
         */
        Paciente pac1 = new Paciente("Carlinho", "10/03/2010");
        Paciente pac2 = new Paciente("Pedro mata pombo", "12/09/2000");
        Paciente pac3 = new Paciente("Jesus", "25/12/1800");
            
        
        Atendimento ate1 = new Atendimento(pac1, "20/08/2022 15:00", "21/08/2022 15:00");
        ate1.setMedico(med1);
        System.out.println(ate1);
      
    }

}
