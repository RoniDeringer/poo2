package injecao_dependencia;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Main {

    public static void main(String[] args) {
      
        /** 
         * ALUNOS
         */
        
        Aluno aluno1 = new Aluno("Renato","2018B123", "502.105.901-01", "30/08/1998", "renatinho@gmail.com");
        Aluno aluno2 = new Aluno("Debora", "2018B123", "107.908.152-94", "01/12/2015", "marcio@yahoo.com");
        
        System.out.println(aluno1);
    }
}
