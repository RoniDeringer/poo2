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

        
        /**
         * LINGUAGENS
         */
        AtendimentoPTBR ptbr = new AtendimentoPTBR();
        AtendimentoEN en = new AtendimentoEN();

        
        //ATENDIMENTO 1
        Atendimento ate1 = new Atendimento(pac1, ptbr);
        ate1.setMedico(med1);
        ate1.setInicio("20/08/2022 15:00");
        ate1.setFim("21/08/2022 15:00");
        System.out.println(ate1);

        System.out.println("----------------------");
        
        
        //ATENDIMENTO 2
        Atendimento ate2 = new Atendimento(pac2,en);
        ate2.setMedico(med2);
        ate2.setInicio("20/08/2021 08:00");
        ate2.setFim("21/08/2021 08:00");
        System.out.println(ate2);

        //LISTA ATENDIMENTOS
        ListaAtendimento listaAtendimento = new ListaAtendimento(ate1);
        listaAtendimento.addLista(ate2);
//        System.out.println(listaAtendimento);
        //MEDICO DO ATE2 NAO ESTA MOSTRANDO (?)
        
        
    }
}